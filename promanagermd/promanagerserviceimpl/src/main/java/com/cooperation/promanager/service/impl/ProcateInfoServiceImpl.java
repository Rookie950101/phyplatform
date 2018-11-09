package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.ProcateInfoMapper;
import com.cooperation.promanager.pojo.ProcateInfo;
import com.cooperation.promanager.service.ProcateInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProcateInfoServiceImpl implements ProcateInfoService {

    //依赖持久层
    @Resource
    private ProcateInfoMapper procateInfoMapper;  //类目表

    //填入记录
    @Override
    public Long insertRec(Long protypeid, String procatename) {
        ProcateInfo record = new ProcateInfo();
        record.setProtypeid(protypeid);
        record.setProcatename(procatename);
        procateInfoMapper.insertSelective(record);
        //立即得到主键
        Long procateid = record.getProcateid();
        return procateid;
    }
}
