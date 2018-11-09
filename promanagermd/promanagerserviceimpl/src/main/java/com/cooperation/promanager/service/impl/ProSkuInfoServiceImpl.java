package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ProSkuInfoMapper;
import com.cooperation.promanager.dto.ProSkuInfoDTO;
import com.cooperation.promanager.pojo.ProSkuInfo;
import com.cooperation.promanager.service.ProSkuInfoService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

public class ProSkuInfoServiceImpl implements ProSkuInfoService {

    //依赖持久层
    @Resource
    private ProSkuInfoMapper proSkuInfoMapper;

    //添加记录
    @Override
    public Long insertRec(Long baseproid, Long prostdid, String prostdname) {
        ProSkuInfo record = new ProSkuInfo();
        record.setBaseproid(baseproid);
        record.setProstdid(prostdid);
        record.setProskuname(prostdname);   //暂时以规格为SKU字段
        //调用持久层
        proSkuInfoMapper.insertSelective(record);
        //立即得到主键
        Long proskuid = record.getProskuid();
        return proskuid;
    }

    //根据proskuid得到规格名和基础商品信息表baseproid(商品标准SKU表中的SKU字段是以规格名)
    @Override
    public ProSkuInfoDTO select3(Long proskuid) {
        ProSkuInfo pojo = new ProSkuInfo();
        ProSkuInfoDTO proSkuInfoDTO = new ProSkuInfoDTO();
        //调用持久层
        pojo = proSkuInfoMapper.selectByPrimaryKey(proskuid);
        BeanUtils.copyProperties(pojo,proSkuInfoDTO);
        return proSkuInfoDTO;
    }
}
