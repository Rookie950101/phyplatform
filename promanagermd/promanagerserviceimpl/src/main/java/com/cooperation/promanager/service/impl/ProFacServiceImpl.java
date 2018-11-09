package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ProFacMapper;
import com.cooperation.promanager.service.ProFacService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProFacServiceImpl implements ProFacService {

    //依赖持久层
    @Resource
    private ProFacMapper proFacMapper;

    //根据生产厂商名得到id
    @Override
    public Long findByName(String profacname) {
        Long profacid = proFacMapper.selectByName(profacname);
        return profacid;
    }
}
