package com.cooperation.sysuser.dao;

import com.cooperation.sysuser.pojo.BuyerInfo;
import com.cooperation.sysuser.pojo.BuyerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyerInfoMapper {
    long countByExample(BuyerInfoExample example);

    int deleteByExample(BuyerInfoExample example);

    int deleteByPrimaryKey(Long buyerid);

    int insert(BuyerInfo record);

    int insertSelective(BuyerInfo record);

    List<BuyerInfo> selectByExample(BuyerInfoExample example);

    BuyerInfo selectByPrimaryKey(Long buyerid);

    int updateByExampleSelective(@Param("record") BuyerInfo record, @Param("example") BuyerInfoExample example);

    int updateByExample(@Param("record") BuyerInfo record, @Param("example") BuyerInfoExample example);

    int updateByPrimaryKeySelective(BuyerInfo record);

    int updateByPrimaryKey(BuyerInfo record);

    //************************后加**************************
    //获取普通用户列表
    List<BuyerInfo> selectAll();

}