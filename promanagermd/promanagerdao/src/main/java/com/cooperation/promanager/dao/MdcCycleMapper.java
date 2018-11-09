package com.cooperation.promanager.dao;

import com.cooperation.promanager.dto.MdcCycleDTO1;
import com.cooperation.promanager.pojo.MdcCycle;
import com.cooperation.promanager.pojo.MdcCycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdcCycleMapper {
    long countByExample(MdcCycleExample example);

    int deleteByExample(MdcCycleExample example);

    int deleteByPrimaryKey(Long mdccyid);

    int insert(MdcCycle record);

    int insertSelective(MdcCycle record);

    List<MdcCycle> selectByExample(MdcCycleExample example);

    MdcCycle selectByPrimaryKey(Long mdccyid);

    int updateByExampleSelective(@Param("record") MdcCycle record, @Param("example") MdcCycleExample example);

    int updateByExample(@Param("record") MdcCycle record, @Param("example") MdcCycleExample example);

    int updateByPrimaryKeySelective(MdcCycle record);

    int updateByPrimaryKey(MdcCycle record);

    //*******************后加***********************
    //查询全部
    List<MdcCycle> selectAll();

}