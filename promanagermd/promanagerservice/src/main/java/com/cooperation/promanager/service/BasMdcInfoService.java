package com.cooperation.promanager.service;

import com.cooperation.promanager.dto.BasMdcInfoDTO;

public interface BasMdcInfoService {

    //插入记录
    Long insertRec(String mdcname,Long procateid,String aproid,Long probandid);

    //根据basemdcid得到药品名和品牌库id
    BasMdcInfoDTO findById(Long basemdcid);
}
