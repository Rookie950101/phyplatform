package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ProType;
import com.cooperation.promanager.pojo.ProTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProTypeMapper {
    long countByExample(ProTypeExample example);

    int deleteByExample(ProTypeExample example);

    int deleteByPrimaryKey(Long protypeid);

    int insert(ProType record);

    int insertSelective(ProType record);

    List<ProType> selectByExample(ProTypeExample example);

    ProType selectByPrimaryKey(Long protypeid);

    int updateByExampleSelective(@Param("record") ProType record, @Param("example") ProTypeExample example);

    int updateByExample(@Param("record") ProType record, @Param("example") ProTypeExample example);

    int updateByPrimaryKeySelective(ProType record);

    int updateByPrimaryKey(ProType record);

    //********************后加*************************
    //根据类型名查id
    Long selectByName(String protypename);

}