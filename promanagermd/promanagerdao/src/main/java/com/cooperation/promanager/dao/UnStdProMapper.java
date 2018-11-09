package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.UnStdPro;
import com.cooperation.promanager.pojo.UnStdProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnStdProMapper {
    long countByExample(UnStdProExample example);

    int deleteByExample(UnStdProExample example);

    int deleteByPrimaryKey(Long proid);

    int insert(UnStdPro record);

    int insertSelective(UnStdPro record);

    List<UnStdPro> selectByExample(UnStdProExample example);

    UnStdPro selectByPrimaryKey(Long proid);

    int updateByExampleSelective(@Param("record") UnStdPro record, @Param("example") UnStdProExample example);

    int updateByExample(@Param("record") UnStdPro record, @Param("example") UnStdProExample example);

    int updateByPrimaryKeySelective(UnStdPro record);

    int updateByPrimaryKey(UnStdPro record);
}