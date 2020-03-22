package com.wx.wechatapp.service.area.service;

import com.wx.wechatapp.service.area.pojo.RegionCodeData;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      生成areacode接口
 */

@Component
public interface CodeCreate {
    String codeCreate(String... T);
}
