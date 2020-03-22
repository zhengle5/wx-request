package com.wx.wechatapp.service.problem;

import com.wx.wechatapp.mappers.RequestMapper;
import com.wx.wechatapp.service.area.service.imp.AreaCodeCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      总controller
 */

@RestController
@RequestMapping("/wx")
public class RequestController {

    @Autowired
    private RequestMapper requestMapper;
    @Autowired
    private AreaCodeCreator areaCodeCreator;

    @RequestMapping("/request")
    public String wxRequest(@RequestBody RequestData data) throws IOException {
        requestMapper.insert_request(data);
        return "ok";
    }

    @RequestMapping("/areacode")
    public String areaCodeRequest(@RequestBody String[] data) throws IOException{
        areaCodeCreator.codeCreate(data);
        System.out.println("生成成功！ 区域编码为" + areaCodeCreator.codeCreate(data));
        return areaCodeCreator.codeCreate(data);
    }
}
