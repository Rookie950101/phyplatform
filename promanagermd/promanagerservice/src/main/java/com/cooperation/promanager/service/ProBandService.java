package com.cooperation.promanager.service;

public interface ProBandService {

    //根据品牌名得到品牌id
    Long findByName(String probandname);

    //根据品牌id得到品牌名
    String findNameById(Long probandid);
}
