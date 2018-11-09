package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.BasProInfoMapper;
import com.cooperation.promanager.dto.BasProInfoDTO;
import com.cooperation.promanager.pojo.BasProInfo;
import com.cooperation.promanager.service.BasProInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BasProInfoServiceImpl implements BasProInfoService {

    //依赖持久层
    @Resource
    private BasProInfoMapper basProInfoMapper;

    //添加记录
    @Override
    public Long insertRec(Long procateid, Long probandid, Long profacid, String proname, String apronum) {
        BasProInfo record = new BasProInfo();
        record.setProcateid(procateid);
        record.setProbandid(probandid);
        record.setProfacid(profacid);
        record.setProname(proname);
        record.setApronum(apronum);
        //调用持久层
        basProInfoMapper.insertSelective(record);
        //立即得到主键
        Long baseproid = record.getBaseproid();
        return baseproid;
    }

    //通过id查找
    @Override
    public BasProInfoDTO findById(Long baseproid) {
        BasProInfo pojo = new BasProInfo();
        BasProInfoDTO basProInfoDTO = new BasProInfoDTO();
        //调用持久层
        pojo = basProInfoMapper.selectByPrimaryKey(baseproid);
        BeanUtils.copyProperties(pojo,basProInfoDTO);
        return basProInfoDTO;
    }

}
