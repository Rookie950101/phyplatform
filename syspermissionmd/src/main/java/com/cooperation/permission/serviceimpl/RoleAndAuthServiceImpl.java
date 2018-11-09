package com.cooperation.permission.serviceimpl;


import com.cooperation.common.bean.permission.dto.RoleAndAuthKeyDTO;
import com.cooperation.permission.dao.RoleAndAuthMapper;
import com.cooperation.permission.pojo.RoleAndAuthKey;
import com.cooperation.permission.service.RoleAndAuthService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleAndAuthServiceImpl implements RoleAndAuthService {

    //服务层依赖持久层
    @Resource
    private RoleAndAuthMapper roleAndAuthMapper;

    //将用户角色与相应的权限对应起来
    @Override
    public int insert(RoleAndAuthKeyDTO dto) {
        //定义一个pojo实体对象
        RoleAndAuthKey record = new RoleAndAuthKey();
        BeanUtils.copyProperties(dto,record);
        //调用持久层
        int i = roleAndAuthMapper.insertSelective(record);
        return i;
    }

    //根据角色id得到权限id
    @Override
    public List<Long> selectaids(Long roleid) {
        List<Long> aids = new ArrayList<>();
        aids = roleAndAuthMapper.selectaids(roleid);
        return aids;
    }

    //在角色权限表中，添加关联关系
    @Override
    public int addauth(Long roleid, Long authid) {
        RoleAndAuthKey pojo = new RoleAndAuthKey();
        pojo.setRoleid(roleid);
        pojo.setAuthid(authid);
        int i = roleAndAuthMapper.insert(pojo);
        return i;
    }

    //在角色权限表中，删除关联关系
    @Override
    public int deleteauth(Long roleid, Long authid) {
        RoleAndAuthKey pojo = new RoleAndAuthKey();
        pojo.setRoleid(roleid);
        pojo.setAuthid(authid);
        int i = roleAndAuthMapper.deleteByPrimaryKey(pojo);
        return i;
    }

}