package com.cooperation.permission.service;


import com.cooperation.common.bean.permission.dto.SysAndRoleKeyDTO;

public interface SysAndRoleService {

    //将用户和角色信息对应起来
    int insert(SysAndRoleKeyDTO dto);

    //根据系统id,得到角色id
    Long selectrid(Long sysuserid);

}
