package com.cooperation.promanager.service;

public interface MdcInfoService {

    //插入记录
    int insertRec(Long mdcskuid,Long showflag);

    //根据mdcid得到mdcskuid
    Long select2(Long mdcid);


}
