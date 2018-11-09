package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.StdCycleMapper;
import com.cooperation.promanager.dto.StdCycleDTO1;
import com.cooperation.promanager.pojo.StdCycle;
import com.cooperation.promanager.service.StdCycleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StdCycleServiceImpl implements StdCycleService {

    //依赖持久层
    @Resource
    private StdCycleMapper stdCycleMapper;

    //查找全部
    @Override
    public List<StdCycleDTO1> findAll() {
        List<StdCycle> pojos = new ArrayList<>();
        List<StdCycleDTO1> dtos = new ArrayList<>();
        pojos = stdCycleMapper.selectAll();
        for (StdCycle pojo : pojos){
            StdCycleDTO1 dto = new StdCycleDTO1();
            BeanUtils.copyProperties(pojo,dto);
            dtos.add(dto);
        }
        return dtos;
    }
}
