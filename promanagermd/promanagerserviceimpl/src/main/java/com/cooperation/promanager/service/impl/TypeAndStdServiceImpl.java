package com.cooperation.promanager.service.impl;

import com.cooperation.promanager.dao.TypeAndStdMapper;
import com.cooperation.promanager.dto.TypeAndStdDTO;
import com.cooperation.promanager.pojo.TypeAndStdKey;
import com.cooperation.promanager.service.TypeAndStdService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TypeAndStdServiceImpl implements TypeAndStdService {

    //依赖持久层
    private TypeAndStdMapper typeAndStdMapper;

    //插入记录
    @Override
    public int insertRec(TypeAndStdDTO dto) {
        TypeAndStdKey record = new TypeAndStdKey();
        BeanUtils.copyProperties(dto,record);
        int i = typeAndStdMapper.insert(record);
        return i;
    }
}
