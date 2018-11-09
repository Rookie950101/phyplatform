package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.UnStdProMapper;
import com.cooperation.promanager.pojo.UnStdPro;
import com.cooperation.promanager.service.UnStdProService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UnStdProServiceImpl implements UnStdProService {

    //依赖持久层
    @Resource
    private UnStdProMapper unStdProMapper;

    //填入记录
    @Override
    public int insertRec(Long profacid, Long probandid, Long procateid,String unstdproname,Long showflag) {
        UnStdPro record = new UnStdPro();
        record.setProfacid(profacid);
        record.setProbandid(probandid);
        record.setProcateid(procateid);
        record.setUnstdproname(unstdproname);
        record.setShowflag(showflag);
        int i = unStdProMapper.insertSelective(record);
        return i;
    }
}
