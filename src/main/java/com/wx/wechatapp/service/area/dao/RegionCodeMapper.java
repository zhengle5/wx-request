package com.wx.wechatapp.service.area.dao;


import com.wx.wechatapp.service.area.pojo.RegionCodeData;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      region_code映射表及sql
 */



@Component
@Mapper
public interface RegionCodeMapper {

    @Results(value={
            @Result(property = "name", column = "name"),
            @Result(property = "goverment_id", column = "goverment_id"),
            @Result(property = "country_id", column = "country_id"),
            @Result(property = "city_id", column = "city_id"),
            @Result(property = "id", column = "id"),
    })

    @Select("select goverment_id from region_code where name = #{name}")
    RegionCodeData selectGoverment(String name);

    @Select("select goverment_id, country_id from region_code where goverment_id = #{goverment_id} and name = #{name}")
    RegionCodeData selectCountry(String goverment_id,String name);

    @Select("select * from region_code where goverment_id = #{goverment_id} and country_id = #{country_id} and name = #{name}")
    RegionCodeData selectCity(String goverment_id, String country_id, String name);

}
