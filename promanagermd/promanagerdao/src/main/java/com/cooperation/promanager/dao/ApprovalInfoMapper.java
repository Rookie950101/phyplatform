package com.cooperation.promanager.dao;

import com.cooperation.promanager.pojo.ApprovalInfo;
import com.cooperation.promanager.pojo.ApprovalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalInfoMapper {
    long countByExample(ApprovalInfoExample example);

    int deleteByExample(ApprovalInfoExample example);

    int deleteByPrimaryKey(String aproid);

    int insert(ApprovalInfo record);

    int insertSelective(ApprovalInfo record);

    List<ApprovalInfo> selectByExample(ApprovalInfoExample example);

    ApprovalInfo selectByPrimaryKey(String aproid);

    int updateByExampleSelective(@Param("record") ApprovalInfo record, @Param("example") ApprovalInfoExample example);

    int updateByExample(@Param("record") ApprovalInfo record, @Param("example") ApprovalInfoExample example);

    int updateByPrimaryKeySelective(ApprovalInfo record);

    int updateByPrimaryKey(ApprovalInfo record);
}