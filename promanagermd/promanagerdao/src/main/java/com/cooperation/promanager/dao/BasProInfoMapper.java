package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.BasProInfo;
import com.cooperation.promanager.pojo.BasProInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasProInfoMapper {
    long countByExample(BasProInfoExample example);

    int deleteByExample(BasProInfoExample example);

    int deleteByPrimaryKey(Long baseproid);

    int insert(BasProInfo record);

    int insertSelective(BasProInfo record);

    List<BasProInfo> selectByExample(BasProInfoExample example);

    BasProInfo selectByPrimaryKey(Long baseproid);

    int updateByExampleSelective(@Param("record") BasProInfo record, @Param("example") BasProInfoExample example);

    int updateByExample(@Param("record") BasProInfo record, @Param("example") BasProInfoExample example);

    int updateByPrimaryKeySelective(BasProInfo record);

    int updateByPrimaryKey(BasProInfo record);
}