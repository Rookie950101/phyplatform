package com.cooperation.permission.dao;

import com.cooperation.permission.pojo.SysAndRoleExample;
import com.cooperation.permission.pojo.SysAndRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAndRoleMapper {
    long countByExample(SysAndRoleExample example);

    int deleteByExample(SysAndRoleExample example);

    int deleteByPrimaryKey(SysAndRoleKey key);

    int insert(SysAndRoleKey record);

    int insertSelective(SysAndRoleKey record);

    List<SysAndRoleKey> selectByExample(SysAndRoleExample example);

    int updateByExampleSelective(@Param("record") SysAndRoleKey record, @Param("example") SysAndRoleExample example);

    int updateByExample(@Param("record") SysAndRoleKey record, @Param("example") SysAndRoleExample example);

    //******************后加**********************

    //根据系统id得到角色id
    Long selectrid(Long sysuserid);

    long selectRoleId(long sysuserid);
}