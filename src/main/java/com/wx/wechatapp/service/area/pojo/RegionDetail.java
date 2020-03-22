package com.wx.wechatapp.service.area.pojo;

import com.wx.wechatapp.service.area.dao.RegionCodeMapper;
import org.springframework.stereotype.Component;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      暂时没用   区域编码信息pojo
 */

@Component
public class RegionDetail {

    private String gorverment;
    private String gorverment_code;
    private String country;
    private String country_code;
    private String city;
    private String city_code;
    private RegionCodeMapper regionCodeMapper;

    public  RegionDetail(){}

    public RegionDetail(String gorverment,String country,String city){
        this.gorverment = gorverment;
        this.country = country;
        this.city = city;
    }


    public String getAreaName(){
        return (gorverment + country + city);
    }

    public String getAreacode(){
        return (gorverment_code + country_code + city_code);
    }

    public String getGorverment() {
        return gorverment;
    }

    public void setGorverment(String gorverment) {
        this.gorverment = gorverment;
    }

    public String getGorverment_code() {
        return gorverment_code;
    }

    public void setGorverment_code(String gorverment_code) {
        this.gorverment_code = gorverment_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }



}
