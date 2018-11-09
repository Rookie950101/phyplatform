package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ProFm;
import com.cooperation.promanager.pojo.ProFmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProFmMapper {
    long countByExample(ProFmExample example);

    int deleteByExample(ProFmExample example);

    int deleteByPrimaryKey(Long profmid);

    int insert(ProFm record);

    int insertSelective(ProFm record);

    List<ProFm> selectByExample(ProFmExample example);

    ProFm selectByPrimaryKey(Long profmid);

    int updateByExampleSelective(@Param("record") ProFm record, @Param("example") ProFmExample example);

    int updateByExample(@Param("record") ProFm record, @Param("example") ProFmExample example);

    int updateByPrimaryKeySelective(ProFm record);

    int updateByPrimaryKey(ProFm record);

    //**********************后加************************
    //根据剂型名得到id
    Long selectByName(String profmname);
}