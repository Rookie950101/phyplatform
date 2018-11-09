package com.cooperation.permission.dao;

import com.cooperation.permission.pojo.RoleAndAuthExample;
import com.cooperation.permission.pojo.RoleAndAuthKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAndAuthMapper {
    long countByExample(RoleAndAuthExample example);

    int deleteByExample(RoleAndAuthExample example);

    int deleteByPrimaryKey(RoleAndAuthKey key);

    int insert(RoleAndAuthKey record);

    int insertSelective(RoleAndAuthKey record);

    List<RoleAndAuthKey> selectByExample(RoleAndAuthExample example);

    int updateByExampleSelective(@Param("record") RoleAndAuthKey record, @Param("example") RoleAndAuthExample example);

    int updateByExample(@Param("record") RoleAndAuthKey record, @Param("example") RoleAndAuthExample example);

    //**********************后加**************************

    List<Long> selectAuid(long roleid);
    //根据角色id得到权限id
    List<Long> selectaids(Long roleid);
}