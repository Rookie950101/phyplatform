package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.UnstdCycle;
import com.cooperation.promanager.pojo.UnstdCycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnstdCycleMapper {
    long countByExample(UnstdCycleExample example);

    int deleteByExample(UnstdCycleExample example);

    int deleteByPrimaryKey(Long unstdid);

    int insert(UnstdCycle record);

    int insertSelective(UnstdCycle record);

    List<UnstdCycle> selectByExample(UnstdCycleExample example);

    UnstdCycle selectByPrimaryKey(Long unstdid);

    int updateByExampleSelective(@Param("record") UnstdCycle record, @Param("example") UnstdCycleExample example);

    int updateByExample(@Param("record") UnstdCycle record, @Param("example") UnstdCycleExample example);

    int updateByPrimaryKeySelective(UnstdCycle record);

    int updateByPrimaryKey(UnstdCycle record);

    //*****************后加************************
    //查询全部
    List<UnstdCycle> selectAll();
}