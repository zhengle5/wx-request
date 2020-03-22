package com.wx.wechatapp.service.problem;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/3/23
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 * Description:
 *      project_problem  Mybatis pojo
 */

public class RequestData {

    private String data ;
    private String person ;
    private String tel ;
    private String project ;
    private String question ;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "RequestData{" +
                "data='" + data + '\'' +
                ", person='" + person + '\'' +
                ", tel='" + tel + '\'' +
                ", project='" + project + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
