package com.cooperation.promanager.service;

import com.cooperation.promanager.dto.BasProInfoDTO;

public interface BasProInfoService {

    //添加记录
    Long insertRec(Long procateid,Long probandid,Long profacid,String proname,String apronum);

    //通过id查找
    BasProInfoDTO findById(Long baseproid);
}
