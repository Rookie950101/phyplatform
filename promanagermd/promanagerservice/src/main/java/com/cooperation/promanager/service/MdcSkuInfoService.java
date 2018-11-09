package com.cooperation.promanager.service;

import com.cooperation.promanager.dto.MdcSkuInfoDTO;
import com.cooperation.promanager.pojo.MdcSkuInfo;

import javax.annotation.Resource;

public interface MdcSkuInfoService {

    //插入记录
    Long insertRec(Long basemdcid,Long prostdid,String prostdname);

    //根据mdcskuid得到规格名和基础药品信息表basemdcid（药品标准SKU表中的sku字段是规格名）
    MdcSkuInfoDTO select2(Long mdcskuid);


}
