package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.MdcCycleMapper;
import com.cooperation.promanager.dto.MdcCycleDTO1;
import com.cooperation.promanager.pojo.MdcCycle;
import com.cooperation.promanager.service.MdcCycleService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class MdcCycleServiceImpl implements MdcCycleService {

    //依赖持久层
    @Resource
    private MdcCycleMapper mdcCycleMapper;

    //查询全部
    @Override
    public List<MdcCycleDTO1> findAll() {
        List<MdcCycle> pojos = new ArrayList<>();
        List<MdcCycleDTO1> dtos = new ArrayList<>();
        //调用持久层，查询全部
        pojos = mdcCycleMapper.selectAll();
        for (MdcCycle pojo : pojos){
            MdcCycleDTO1 dto1 = new MdcCycleDTO1();
            BeanUtils.copyProperties(pojo,dto1);
            dtos.add(dto1);
        }
        return dtos;
    }
}