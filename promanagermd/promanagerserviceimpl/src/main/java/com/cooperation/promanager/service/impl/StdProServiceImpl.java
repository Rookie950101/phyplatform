package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.StdProMapper;
import com.cooperation.promanager.pojo.StdPro;
import com.cooperation.promanager.service.StdProService;

import javax.annotation.Resource;

public class StdProServiceImpl implements StdProService {

    //依赖持久层
    @Resource
    private StdProMapper stdProMapper;

    //添加记录
    @Override
    public int insertRec(Long proskuid, Long showflag) {
        StdPro record = new StdPro();
        record.setProskuid(proskuid);
        record.setShowflag(showflag);
        //调用持久层
        int i = stdProMapper.insertSelective(record);
        return i;
    }

    //根据 stdproid 得到 proskuid
    @Override
    public Long select3(Long stdproid) {
        Long proskuid = stdProMapper.select3(stdproid);
        return proskuid;
    }
}
