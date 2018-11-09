package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ProFmMapper;
import com.cooperation.promanager.service.ProFmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProFmServiceImpl implements ProFmService {

    //依赖持久层
    @Resource
    private ProFmMapper proFmMapper;

    //根据剂型名得到id
    @Override
    public Long findByName(String profmname) {
        Long profmid = proFmMapper.selectByName(profmname);
        return profmid;
    }
}
