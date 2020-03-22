package com.wx.wechatapp.service;

import com.wx.wechatapp.service.problem.RequestData;
import com.wx.wechatapp.mappers.RequestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2020/2/17
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Deprecated
public class UserService {


    public void insert(RequestData data) throws IOException {

        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("mybatis/mybatis-config.xml");
        EncodedResource encodedResource = new EncodedResource(resource, "UTF-8");

        Reader reader = encodedResource.getReader();
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader, "dev", new Properties());
        SqlSession session = factory.openSession();


        RequestMapper mapper = session.getMapper(RequestMapper.class);
        int result = mapper.insert_request(data);
        System.out.println(result);
        session.commit();
        session.close();

    }
}
