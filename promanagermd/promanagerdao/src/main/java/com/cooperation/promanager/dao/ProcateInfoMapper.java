package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ProcateInfo;
import com.cooperation.promanager.pojo.ProcateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcateInfoMapper {
    long countByExample(ProcateInfoExample example);

    int deleteByExample(ProcateInfoExample example);

    int deleteByPrimaryKey(Long procateid);

    int insert(ProcateInfo record);

    int insertSelective(ProcateInfo record);

    List<ProcateInfo> selectByExample(ProcateInfoExample example);

    ProcateInfo selectByPrimaryKey(Long procateid);

    int updateByExampleSelective(@Param("record") ProcateInfo record, @Param("example") ProcateInfoExample example);

    int updateByExample(@Param("record") ProcateInfo record, @Param("example") ProcateInfoExample example);

    int updateByPrimaryKeySelective(ProcateInfo record);

    int updateByPrimaryKey(ProcateInfo record);
}