package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ProTypeMapper;
import com.cooperation.promanager.service.ProTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProTypeServiceImpl implements ProTypeService {

    //依赖持久层
    @Resource
    private ProTypeMapper proTypeMapper; //类型库表


     //根据类型名获取类型id
    @Override
    public Long findByName(String protypename) {
        Long protypeid = proTypeMapper.selectByName(protypename);
        return protypeid;
    }
}
