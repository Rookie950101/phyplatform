package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.StdCycle;
import com.cooperation.promanager.pojo.StdCycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StdCycleMapper {
    long countByExample(StdCycleExample example);

    int deleteByExample(StdCycleExample example);

    int deleteByPrimaryKey(Long stdcyid);

    int insert(StdCycle record);

    int insertSelective(StdCycle record);

    List<StdCycle> selectByExample(StdCycleExample example);

    StdCycle selectByPrimaryKey(Long stdcyid);

    int updateByExampleSelective(@Param("record") StdCycle record, @Param("example") StdCycleExample example);

    int updateByExample(@Param("record") StdCycle record, @Param("example") StdCycleExample example);

    int updateByPrimaryKeySelective(StdCycle record);

    int updateByPrimaryKey(StdCycle record);

    //******************后加********************
    //查询全部
    List<StdCycle> selectAll();

}