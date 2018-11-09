package com.cooperation.promanager.service;

import com.cooperation.promanager.dto.ProSkuInfoDTO;

public interface ProSkuInfoService {

    //添加记录
    Long insertRec(Long baseproid,Long prostdid,String prostdname);

    //根据proskuid得到规格名和基础商品信息表baseproid(商品标准SKU表中的SKU字段是以规格名)
    ProSkuInfoDTO select3(Long proskuid);
}
