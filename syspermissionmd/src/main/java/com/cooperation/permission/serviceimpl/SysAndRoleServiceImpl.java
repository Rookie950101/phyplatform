package com.cooperation.permission.serviceimpl;


import com.cooperation.common.bean.permission.dto.SysAndRoleKeyDTO;
import com.cooperation.permission.dao.SysAndRoleMapper;
import com.cooperation.permission.pojo.SysAndRoleKey;
import com.cooperation.permission.service.SysAndRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysAndRoleServiceImpl implements SysAndRoleService {

    //服务层依赖持久层
    @Resource
    private SysAndRoleMapper sysAndRoleMapper;

    //将用户和角色信息对应起来
    @Override
    public int insert(SysAndRoleKeyDTO dto) {
        //定义一个pojo实体对象
        SysAndRoleKey record = new SysAndRoleKey();
        BeanUtils.copyProperties(dto,record);
        //调用持久层
        int i = sysAndRoleMapper.insertSelective(record);
        return i;
    }

    //根据系统id得到角色id
    @Override
    public Long selectrid(Long sysuserid) {
        Long roleid = sysAndRoleMapper.selectrid(sysuserid);
        return roleid;
    }

}