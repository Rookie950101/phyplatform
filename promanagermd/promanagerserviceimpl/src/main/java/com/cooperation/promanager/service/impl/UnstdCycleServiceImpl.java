package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.UnstdCycleMapper;
import com.cooperation.promanager.dto.UnstdCycleDTO1;
import com.cooperation.promanager.pojo.UnstdCycle;
import com.cooperation.promanager.service.UnstdCycleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UnstdCycleServiceImpl implements UnstdCycleService {

    //依赖持久层
    @Resource
    private UnstdCycleMapper unstdCycleMapper;

    //查找全部
    @Override
    public List<UnstdCycleDTO1> findAll() {
        List<UnstdCycle> pojos = new ArrayList<>();
        List<UnstdCycleDTO1> dtos = new ArrayList<>();
        //调用持久层
        pojos =  unstdCycleMapper.selectAll();
        for (UnstdCycle pojo : pojos){
            UnstdCycleDTO1 dto = new UnstdCycleDTO1();
            BeanUtils.copyProperties(pojo,dto);
            dtos.add(dto);
        }
        return dtos;
    }
}