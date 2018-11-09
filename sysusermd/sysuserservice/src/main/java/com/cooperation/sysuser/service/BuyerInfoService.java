package com.cooperation.sysuser.service;

import com.cooperation.sysuser.dto.BuyerInfoDTO;
import com.cooperation.sysuser.dto.BuyerInfoDTO1;

import java.util.List;

public interface BuyerInfoService {

    //获取用户列表
    List<BuyerInfoDTO> getConList();

    //通过id查询普通用户列表
    BuyerInfoDTO1 getSinConById(long conid);

    //修改普通用户信息
    int updateConById(BuyerInfoDTO1 dto);

}
