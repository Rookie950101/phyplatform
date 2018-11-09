package com.cooperation.promanager.service;

public interface StdProService {

    //添加记录
    int insertRec(Long proskuid,Long showflag);

    //根据 stdproid 得到 proskuid
    Long select3(Long stdproid);
}
