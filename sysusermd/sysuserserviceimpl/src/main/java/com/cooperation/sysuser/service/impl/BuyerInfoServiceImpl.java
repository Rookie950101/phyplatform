package com.cooperation.sysuser.service.impl;

import com.cooperation.sysuser.dao.BuyerInfoMapper;
import com.cooperation.sysuser.dto.BuyerInfoDTO;
import com.cooperation.sysuser.dto.BuyerInfoDTO1;
import com.cooperation.sysuser.pojo.BuyerInfo;
import com.cooperation.sysuser.service.BuyerInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class BuyerInfoServiceImpl implements BuyerInfoService {

    //依赖持久层
    @Resource
    private BuyerInfoMapper buyerInfoMapper;

    //获取普通用户列表
    @Override
    public List<BuyerInfoDTO> getConList() {
        List<BuyerInfo> pojos = new ArrayList<>();
        List<BuyerInfoDTO> dtos = new LinkedList<>();
        //调用持久层接口
        pojos = buyerInfoMapper.selectAll();
        for (BuyerInfo pojo : pojos){
            BuyerInfoDTO dto = new BuyerInfoDTO();
            BeanUtils.copyProperties(pojo,dto);
            dtos.add(dto);
        }
        return dtos;
    }

    //通过id查询普通用户
    @Override
    public BuyerInfoDTO1 getSinConById(long conid) {
        BuyerInfo pojo = new BuyerInfo();
        pojo = buyerInfoMapper.selectByPrimaryKey(conid);
        BuyerInfoDTO1 dto = new BuyerInfoDTO1();
        BeanUtils.copyProperties(pojo,dto);
        return dto;
    }

    //修改普通用户信息
    @Override
    public int updateConById(BuyerInfoDTO1 dto) {
        //定义一个实体类pojo
        BuyerInfo pojo = new BuyerInfo();
        //复制数据到pojo,前提是两个对象的字段和字段的类型都是一样的，不一样的字段复制不成功
        BeanUtils.copyProperties(dto,pojo);
        int i = buyerInfoMapper.updateByPrimaryKeySelective(pojo);
        return i;
    }


}
