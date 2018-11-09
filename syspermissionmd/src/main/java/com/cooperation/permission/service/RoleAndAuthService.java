package com.cooperation.permission.service;

import com.cooperation.common.bean.permission.dto.RoleAndAuthKeyDTO;

import java.util.List;

public interface RoleAndAuthService {

    //将用户角色与相应的权限对应起来
    int insert(RoleAndAuthKeyDTO dto);

    //根据角色id得到权限id
    List<Long> selectaids(Long roleid);

    //在角色权限表中添加对应关联
    int addauth(Long roleid,Long authid);

    //在角色权限表中删除对应关系
    int deleteauth(Long roleid,Long authid);

}
