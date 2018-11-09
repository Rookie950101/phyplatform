package com.cooperation.permission.dao;

import com.cooperation.permission.pojo.AuthorityInfo;
import com.cooperation.permission.pojo.AuthorityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityInfoMapper {
    long countByExample(AuthorityInfoExample example);

    int deleteByExample(AuthorityInfoExample example);

    int deleteByPrimaryKey(Long authid);

    int insert(AuthorityInfo record);

    int insertSelective(AuthorityInfo record);

    List<AuthorityInfo> selectByExample(AuthorityInfoExample example);

    AuthorityInfo selectByPrimaryKey(Long authid);

    int updateByExampleSelective(@Param("record") AuthorityInfo record, @Param("example") AuthorityInfoExample example);

    int updateByExample(@Param("record") AuthorityInfo record, @Param("example") AuthorityInfoExample example);

    int updateByPrimaryKeySelective(AuthorityInfo record);

    int updateByPrimaryKey(AuthorityInfo record);

    //*********************后加************************

    String selectAuthType(long authid);

    //根据权限id得到权限
    String getauth(Long authid);
}