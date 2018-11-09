package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ComProStd;
import com.cooperation.promanager.pojo.ComProStdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComProStdMapper {
    long countByExample(ComProStdExample example);

    int deleteByExample(ComProStdExample example);

    int deleteByPrimaryKey(Long prostdid);

    int insert(ComProStd record);

    int insertSelective(ComProStd record);

    List<ComProStd> selectByExample(ComProStdExample example);

    ComProStd selectByPrimaryKey(Long prostdid);

    int updateByExampleSelective(@Param("record") ComProStd record, @Param("example") ComProStdExample example);

    int updateByExample(@Param("record") ComProStd record, @Param("example") ComProStdExample example);

    int updateByPrimaryKeySelective(ComProStd record);

    int updateByPrimaryKey(ComProStd record);

    //**********************后加***********************
    //根据规格名获取规格id
    Long selectByName(String prostdname);

}