package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.TypeAndStdExample;
import com.cooperation.promanager.pojo.TypeAndStdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeAndStdMapper {
    long countByExample(TypeAndStdExample example);

    int deleteByExample(TypeAndStdExample example);

    int deleteByPrimaryKey(TypeAndStdKey key);

    int insert(TypeAndStdKey record);

    int insertSelective(TypeAndStdKey record);

    List<TypeAndStdKey> selectByExample(TypeAndStdExample example);

    int updateByExampleSelective(@Param("record") TypeAndStdKey record, @Param("example") TypeAndStdExample example);

    int updateByExample(@Param("record") TypeAndStdKey record, @Param("example") TypeAndStdExample example);
}