package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ComProStdMapper;
import com.cooperation.promanager.service.ComProStdService;
import org.springframework.stereotype.Service;

@Service
public class ComProStdServiceImpl implements ComProStdService {

    //依赖持久层
    private ComProStdMapper comProStdMapper;  //通用规格库

    //根据规格名获取规格id
    @Override
    public Long findByName(String prostdname) {
        Long prostdid = comProStdMapper.selectByName(prostdname);
        return prostdid;
    }
}
