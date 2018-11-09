package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.BanFm;
import com.cooperation.promanager.pojo.BanFmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanFmMapper {
    long countByExample(BanFmExample example);

    int deleteByExample(BanFmExample example);

    int deleteByPrimaryKey(Long banfmid);

    int insert(BanFm record);

    int insertSelective(BanFm record);

    List<BanFm> selectByExample(BanFmExample example);

    BanFm selectByPrimaryKey(Long banfmid);

    int updateByExampleSelective(@Param("record") BanFm record, @Param("example") BanFmExample example);

    int updateByExample(@Param("record") BanFm record, @Param("example") BanFmExample example);

    int updateByPrimaryKeySelective(BanFm record);

    int updateByPrimaryKey(BanFm record);
}