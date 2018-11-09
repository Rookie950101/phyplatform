package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ProBandMapper;
import com.cooperation.promanager.service.ProBandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProBandServiceImpl implements ProBandService {

    //依赖持久层
    @Resource
    private ProBandMapper proBandMapper;

    //根据品牌名得到品牌id
    @Override
    public Long findByName(String probandname) {
        Long probandid = proBandMapper.selectByName(probandname);
        return probandid;
    }

    //根据品牌id得到品牌名
    @Override
    public String findNameById(Long probandid) {
        String probandname = proBandMapper.selectById(probandid);
        return probandname;
    }
}
