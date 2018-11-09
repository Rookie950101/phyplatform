package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.MdcSkuInfoMapper;
import com.cooperation.promanager.dto.MdcSkuInfoDTO;
import com.cooperation.promanager.pojo.MdcSkuInfo;
import com.cooperation.promanager.service.MdcSkuInfoService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

public class MdcSkuInfoServiceImpl implements MdcSkuInfoService {

    //依赖持久层
    @Resource
    private MdcSkuInfoMapper mdcSkuInfoMapper;

    //插入记录
    @Override
    public Long insertRec(Long basemdcid, Long prostdid, String prostdname) {
        MdcSkuInfo record = new MdcSkuInfo();
        record.setBasemdcid(basemdcid);
        record.setProstdid(prostdid);
        record.setMdcskuname(prostdname);
        //插入记录
        mdcSkuInfoMapper.insertSelective(record);
        //立即得到最新插入记录的主键
        Long mdcskuid = record.getMdcskuid();
        return mdcskuid;
    }

    //根据mdcskuid得到规格名（药品标准SKU表中的sku字段是规格名）
    @Override
    public MdcSkuInfoDTO select2(Long mdcskuid) {
        MdcSkuInfoDTO mdcSkuInfoDTO = new MdcSkuInfoDTO();
        MdcSkuInfo pojo = new MdcSkuInfo();
        //调用持久层
        pojo = mdcSkuInfoMapper.selectByPrimaryKey(mdcskuid);
        BeanUtils.copyProperties(pojo,mdcSkuInfoDTO);
        return mdcSkuInfoDTO;
    }
}