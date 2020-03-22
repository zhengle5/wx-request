package com.wx.wechatapp.service.area.service.imp;

import com.wx.wechatapp.service.area.dao.RegionCodeMapper;
import com.wx.wechatapp.service.area.pojo.RegionCodeData;
import com.wx.wechatapp.service.area.pojo.RegionDetail;
import com.wx.wechatapp.service.area.service.CodeCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      生成areacode实现类
 */



@Service
public class AreaCodeCreator implements CodeCreate {

    @Autowired
    private RegionCodeMapper regionCodeMapper;
    @Autowired
    private RegionCodeData regionCodeData;

    @Override
    public String codeCreate(String[] regionName){


        regionCodeData = regionCodeMapper.selectGoverment(regionName[0]);

        regionCodeData = regionCodeMapper.selectCountry(regionCodeData.getGoverment_id(),regionName[1]);

        regionCodeData = regionCodeMapper.selectCity(regionCodeData.getGoverment_id(),regionCodeData.getCountry_id(),regionName[2]);

        String result = String.valueOf(regionCodeData.getId());



        return result;
    }






}
