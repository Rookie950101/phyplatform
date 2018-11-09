package com.cooperation.register.service.impl;

import com.cooperation.register.dao.BuyerInfoMapper;
import com.cooperation.register.dto.BuyerInfoDTO;
import com.cooperation.register.pojo.BuyerInfo;
import com.cooperation.register.service.BuyerInfoService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

public class BuyerInfoServiceImpl implements BuyerInfoService {

    //服务层依赖dao层
    @Resource
    private BuyerInfoMapper buyerInfoMapper;

    //普通用户注册
    @Override
    public int cnnregis(BuyerInfoDTO dto) {
        //定义一个pojo实体类对象
        BuyerInfo record = new BuyerInfo();
        BeanUtils.copyProperties(dto,record);
        int i = buyerInfoMapper.insertSelective(record);
        return i;
    }

}
