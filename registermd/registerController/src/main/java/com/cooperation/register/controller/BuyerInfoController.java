package com.cooperation.register.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.cooperation.common.bean.permission.dto.RoleAndAuthKeyDTO;
import com.cooperation.common.bean.permission.dto.SysAndRoleKeyDTO;
import com.cooperation.common.bean.permission.dto.SysUserDTO;
import com.cooperation.permission.service.RoleAndAuthService;
import com.cooperation.permission.service.RoleInfoService;
import com.cooperation.permission.service.SysAndRoleService;
import com.cooperation.permission.service.SysUserService;
import com.cooperation.register.dto.BuyerInfoDTO;
import com.cooperation.register.service.BuyerInfoService;
import com.cooperation.weblog.annotation.WebOpLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BuyerInfoController {

    //依赖普通用户注册的服务层
    @Resource
    private BuyerInfoService buyerInfoService;

    //远程调用系统权限模块的服务层
    @Reference
    private SysUserService sysUserService;
    @Reference
    private RoleInfoService roleInfoService;
    @Reference
    private SysAndRoleService sysAndRoleService;
    @Reference
    private RoleAndAuthService roleAndAuthService;

    //普通用户注册请求这个地址
    @WebOpLog(operation = "普通用户注册")
    @RequestMapping("/conRegis.do")
    public String comregister(HttpServletRequest request){

        // 1,************ 先在权限 5 张表中操作，插入数据，给该注册用户（调用系统权限模块）********************

        //操作系统用户表
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        SysUserDTO dto = new SysUserDTO();
        dto.setUsername(username);
        dto.setPassword(password);
        //插入后立即得到主键
        long sysuserid =  sysUserService.insuser(dto);

        //操作角色表
        String roletype = request.getParameter("roletype");
        //插入后立即得到主键
        long roleid = roleInfoService.insrole(roletype);

        //操作用户角色表
        SysAndRoleKeyDTO dto1 = new SysAndRoleKeyDTO();
        dto1.setSysuserid(sysuserid);
        dto1.setRoleid(roleid);
        sysAndRoleService.insert(dto1);

        //操作角色权限表
        //普通用户就只给它 查的权限吧，根据实际需要，还可以细分权限，在权限表中自定义权限就行，就是一个字段而已
        long t1 = 4;
        RoleAndAuthKeyDTO dto2 = new RoleAndAuthKeyDTO();
        dto2.setRoleid(roleid);
        dto2.setAuthid(t1);
        roleAndAuthService.insert(dto2);


        // 2,**************操作普通用户信息表，插入数据************************
        String buyername = request.getParameter("buyername");
        String buyerag = request.getParameter("buyerage");
        //将前端获取的字符串转成long类型，因为数据库中的conage是bigint类型的
        long buyerage = Long.parseLong(buyerag);
        String buyerphone = request.getParameter("buyerphone");
        String buyerweixin = request.getParameter("buyerweixin");
        String buyeraddr = request.getParameter("buyeraddr");
        String buyeridentity = request.getParameter("buyeridentity");

        //严格分层思想，定义一个DTO数据传输对象，dto在controller层和service层之间传数据，pojo在service层和dao层间传数据
        BuyerInfoDTO dto5 = new BuyerInfoDTO();
        dto5.setBuyername(buyername);
        dto5.setBuyerage(buyerage);
        dto5.setBuyerphone(buyerphone);
        dto5.setBuyerweixin(buyerweixin);
        dto5.setBuyeraddr(buyeraddr);
        dto5.setBuyeridentity(buyeridentity);

        //调用服务层
        int i = buyerInfoService.cnnregis(dto5);

        if (i > 0){
            //返回json格式的字符串，这个标识，是开发之前约定好的
            return "success";
        }else{
            return "error";
        }

    }



}
