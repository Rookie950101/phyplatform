package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.MdcInfoMapper;
import com.cooperation.promanager.pojo.MdcInfo;
import com.cooperation.promanager.service.MdcInfoService;

import javax.annotation.Resource;

public class MdcInfoServiceImpl implements MdcInfoService {

    //依赖持久层
    @Resource
    private MdcInfoMapper mdcInfoMapper;

    //插入记录
    @Override
    public int insertRec(Long mdcskuid, Long showflag) {
        MdcInfo record = new MdcInfo();
        record.setMdcskuid(mdcskuid);
        record.setShowflag(showflag);
        //调用持久层
        int i = mdcInfoMapper.insertSelective(record);
        return i;
    }

    //根据mdcid得到mdcskuid
    @Override
    public Long select2(Long mdcid) {
        Long mdcskuid = mdcInfoMapper.selectskuid(mdcid);
        return mdcskuid;
    }


}
