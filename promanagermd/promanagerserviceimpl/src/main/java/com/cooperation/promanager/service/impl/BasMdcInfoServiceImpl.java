package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.BasMdcInfoMapper;
import com.cooperation.promanager.dto.BasMdcInfoDTO;
import com.cooperation.promanager.pojo.BasMdcInfo;
import com.cooperation.promanager.service.BasMdcInfoService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

public class BasMdcInfoServiceImpl implements BasMdcInfoService {

    //依赖持久层
    @Resource
    private BasMdcInfoMapper basMdcInfoMapper;

     //插入记录
    @Override
    public Long insertRec(String mdcname, Long procateid, String aproid, Long probandid) {
        BasMdcInfo record = new BasMdcInfo();
        record.setMdcname(mdcname);
        record.setProcateid(procateid);
        record.setAproid(aproid);
        record.setProbandid(probandid);
        basMdcInfoMapper.insertSelective(record);
        Long basemdcid = record.getBasemdcid();
        return basemdcid;
    }

    //根据basemdcid得到药品名和品牌库id
    @Override
    public BasMdcInfoDTO findById(Long basemdcid) {
        BasMdcInfo pojo = new BasMdcInfo();
        BasMdcInfoDTO basMdcInfoDTO = new BasMdcInfoDTO();
        //调用持久层
        pojo = basMdcInfoMapper.selectByPrimaryKey(basemdcid);
        BeanUtils.copyProperties(pojo,basMdcInfoDTO);
        return basMdcInfoDTO;
    }


}