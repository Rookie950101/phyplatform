package com.cooperation.promanager.dao;

import com.cooperation.promanager.dto.MdcSkuInfoDTO;
import com.cooperation.promanager.pojo.MdcSkuInfo;
import com.cooperation.promanager.pojo.MdcSkuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdcSkuInfoMapper {
    long countByExample(MdcSkuInfoExample example);

    int deleteByExample(MdcSkuInfoExample example);

    int deleteByPrimaryKey(Long mdcskuid);

    int insert(MdcSkuInfo record);

    int insertSelective(MdcSkuInfo record);

    List<MdcSkuInfo> selectByExample(MdcSkuInfoExample example);

    MdcSkuInfo selectByPrimaryKey(Long mdcskuid);

    int updateByExampleSelective(@Param("record") MdcSkuInfo record, @Param("example") MdcSkuInfoExample example);

    int updateByExample(@Param("record") MdcSkuInfo record, @Param("example") MdcSkuInfoExample example);

    int updateByPrimaryKeySelective(MdcSkuInfo record);

    int updateByPrimaryKey(MdcSkuInfo record);

    //*****************后加**************************


}