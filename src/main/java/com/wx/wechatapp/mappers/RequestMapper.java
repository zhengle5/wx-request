package com.wx.wechatapp.mappers;

import com.wx.wechatapp.service.problem.RequestData;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      project_problem映射表及sql
 */


@Component
@Mapper
public interface RequestMapper {

    @Results(value={
            @Result(property="data",column="data"),
            @Result(property="person",column="person"),
            @Result(property="tel",column="tel"),
            @Result(property="project",column="project"),
            @Result(property="question",column="question"),
    })
    //注解方法

    @Insert("INSERT INTO project_problem(data,person,tel,project,question) VALUES (#{data},#{person},#{tel},#{project},#{question})")
    int insert_request(RequestData data);
}

