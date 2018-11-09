package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ProSkuInfo;
import com.cooperation.promanager.pojo.ProSkuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProSkuInfoMapper {
    long countByExample(ProSkuInfoExample example);

    int deleteByExample(ProSkuInfoExample example);

    int deleteByPrimaryKey(Long proskuid);

    int insert(ProSkuInfo record);

    int insertSelective(ProSkuInfo record);

    List<ProSkuInfo> selectByExample(ProSkuInfoExample example);

    ProSkuInfo selectByPrimaryKey(Long proskuid);

    int updateByExampleSelective(@Param("record") ProSkuInfo record, @Param("example") ProSkuInfoExample example);

    int updateByExample(@Param("record") ProSkuInfo record, @Param("example") ProSkuInfoExample example);

    int updateByPrimaryKeySelective(ProSkuInfo record);

    int updateByPrimaryKey(ProSkuInfo record);
}