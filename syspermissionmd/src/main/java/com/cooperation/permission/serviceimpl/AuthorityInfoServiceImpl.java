package com.cooperation.permission.serviceimpl;


import com.cooperation.permission.dao.AuthorityInfoMapper;
import com.cooperation.permission.service.AuthorityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AuthorityInfoServiceImpl implements AuthorityInfoService {

    //依赖持久层
    @Resource
    private AuthorityInfoMapper authorityInfoMapper;

    //根据权限id得到权限
    @Override
    public String selectauthtype(Long authid) {
        String auth = authorityInfoMapper.getauth(authid);
        return auth;
    }
}
