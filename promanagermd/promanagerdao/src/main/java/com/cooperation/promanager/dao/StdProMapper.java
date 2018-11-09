package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.StdPro;
import com.cooperation.promanager.pojo.StdProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StdProMapper {
    long countByExample(StdProExample example);

    int deleteByExample(StdProExample example);

    int deleteByPrimaryKey(Long stdproid);

    int insert(StdPro record);

    int insertSelective(StdPro record);

    List<StdPro> selectByExample(StdProExample example);

    StdPro selectByPrimaryKey(Long stdproid);

    int updateByExampleSelective(@Param("record") StdPro record, @Param("example") StdProExample example);

    int updateByExample(@Param("record") StdPro record, @Param("example") StdProExample example);

    int updateByPrimaryKeySelective(StdPro record);

    int updateByPrimaryKey(StdPro record);

    //*******************后加**********************
    //根据 stdproid 得到 proskuid
    Long select3(Long stdproid);

}