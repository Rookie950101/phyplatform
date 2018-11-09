package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ProFac;
import com.cooperation.promanager.pojo.ProFacExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProFacMapper {
    long countByExample(ProFacExample example);

    int deleteByExample(ProFacExample example);

    int deleteByPrimaryKey(Long profacid);

    int insert(ProFac record);

    int insertSelective(ProFac record);

    List<ProFac> selectByExample(ProFacExample example);

    ProFac selectByPrimaryKey(Long profacid);

    int updateByExampleSelective(@Param("record") ProFac record, @Param("example") ProFacExample example);

    int updateByExample(@Param("record") ProFac record, @Param("example") ProFacExample example);

    int updateByPrimaryKeySelective(ProFac record);

    int updateByPrimaryKey(ProFac record);

    //********************后加***********************
    //根据生产厂商名得到id
    Long selectByName(String profacname);
}