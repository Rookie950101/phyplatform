package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.MdcInfo;
import com.cooperation.promanager.pojo.MdcInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdcInfoMapper {
    long countByExample(MdcInfoExample example);

    int deleteByExample(MdcInfoExample example);

    int deleteByPrimaryKey(Long mdcid);

    int insert(MdcInfo record);

    int insertSelective(MdcInfo record);

    List<MdcInfo> selectByExample(MdcInfoExample example);

    MdcInfo selectByPrimaryKey(Long mdcid);

    int updateByExampleSelective(@Param("record") MdcInfo record, @Param("example") MdcInfoExample example);

    int updateByExample(@Param("record") MdcInfo record, @Param("example") MdcInfoExample example);

    int updateByPrimaryKeySelective(MdcInfo record);

    int updateByPrimaryKey(MdcInfo record);

    //******************后加*********************
    //根据mdcid得到mdcskuid
    Long selectskuid(Long mdcid);
}