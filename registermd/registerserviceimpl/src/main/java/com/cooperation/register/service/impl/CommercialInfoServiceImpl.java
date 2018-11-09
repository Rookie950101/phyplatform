package com.cooperation.register.service.impl;


import com.cooperation.register.dao.CommercialInfoMapper;
import com.cooperation.register.dto.CommercialInfoDTO;
import com.cooperation.register.pojo.CommercialInfo;
import com.cooperation.register.service.CommercialInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommercialInfoServiceImpl implements CommercialInfoService {

    //服务层依赖持久层（dao层）
    @Resource
    private CommercialInfoMapper commercialInfoMapper;

    //商户注册
    @Override
    public int comregis(CommercialInfoDTO dto) {
        //定义一个pojo实体对象
        CommercialInfo record = new CommercialInfo();
        BeanUtils.copyProperties(dto,record);
        int i =  commercialInfoMapper.insertSelective(record);
        return i;
    }

}
