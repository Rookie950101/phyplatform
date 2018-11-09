package com.cooperation.permission.serviceimpl;


import com.cooperation.common.bean.permission.dto.SysUserDTO;
import com.cooperation.permission.dao.SysUserMapper;
import com.cooperation.permission.pojo.SysUser;
import com.cooperation.permission.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    //服务层依赖持久层
    private SysUserMapper sysUserMapper;

    //注册用户
    @Override
    public long insuser(SysUserDTO dto) {
        //定义一个pojo实体对象
        SysUser record = new SysUser();
        BeanUtils.copyProperties(dto,record);
        //调用持久层
        sysUserMapper.insertSelective(record);
        //插入后立即得到主键（得配置，参考我的文档）
        long sysuserid = record.getSysuserid();

        return sysuserid;
    }
}
