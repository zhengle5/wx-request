package com.wx.wechatapp.service.area.pojo;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      region_code  Mybatis pojo
 */

@Component
public class RegionCodeData {

    private int id;
    private String name;
    private String goverment_id;
    private String country_id;
    private String city_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoverment_id() {
        return goverment_id;
    }

    public void setGoverment_id(String goverment_id) {
        this.goverment_id = goverment_id;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "RegionCodeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", goverment_id='" + goverment_id + '\'' +
                ", country_id='" + country_id + '\'' +
                ", city_id='" + city_id + '\'' +
                '}';
    }
}
