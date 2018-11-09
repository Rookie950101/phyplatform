package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ApprovalInfoMapper;
import com.cooperation.promanager.pojo.ApprovalInfo;
import com.cooperation.promanager.service.ApprovalInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ApprovalInfoServiceImpl implements ApprovalInfoService {

    //依赖持久层
    @Resource
    private ApprovalInfoMapper approvalInfoMapper;

    //添加记录
    @Override
    public int insertRec(String aproid, Long profmid, Long profacid) {
        ApprovalInfo record = new ApprovalInfo();
        record.setAproid(aproid);
        record.setProfmid(profmid);
        record.setProfacid(profacid);
        int i = approvalInfoMapper.insert(record);
        return i;
    }
}
