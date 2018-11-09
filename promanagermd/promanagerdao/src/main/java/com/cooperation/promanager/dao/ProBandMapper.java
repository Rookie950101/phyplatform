package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ProBand;
import com.cooperation.promanager.pojo.ProBandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProBandMapper {
    long countByExample(ProBandExample example);

    int deleteByExample(ProBandExample example);

    int deleteByPrimaryKey(Long probandid);

    int insert(ProBand record);

    int insertSelective(ProBand record);

    List<ProBand> selectByExample(ProBandExample example);

    ProBand selectByPrimaryKey(Long probandid);

    int updateByExampleSelective(@Param("record") ProBand record, @Param("example") ProBandExample example);

    int updateByExample(@Param("record") ProBand record, @Param("example") ProBandExample example);

    int updateByPrimaryKeySelective(ProBand record);

    int updateByPrimaryKey(ProBand record);

    //***********************后加***************************
    //根据品牌名得到品牌id
    Long selectByName(String probandname);

    //根据品牌id得到品牌名
    String selectById(Long probandid);

}