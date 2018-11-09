package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.BasMdcInfo;
import com.cooperation.promanager.pojo.BasMdcInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasMdcInfoMapper {
    long countByExample(BasMdcInfoExample example);

    int deleteByExample(BasMdcInfoExample example);

    int deleteByPrimaryKey(Long basemdcid);

    int insert(BasMdcInfo record);

    int insertSelective(BasMdcInfo record);

    List<BasMdcInfo> selectByExample(BasMdcInfoExample example);

    BasMdcInfo selectByPrimaryKey(Long basemdcid);

    int updateByExampleSelective(@Param("record") BasMdcInfo record, @Param("example") BasMdcInfoExample example);

    int updateByExample(@Param("record") BasMdcInfo record, @Param("example") BasMdcInfoExample example);

    int updateByPrimaryKeySelective(BasMdcInfo record);

    int updateByPrimaryKey(BasMdcInfo record);
}