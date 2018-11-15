package com.brian.rh.jdbc.orm.mybatis;

//import com.brian.rh.jdbc.orm.mybatis.mapper.UserMapper;
import com.brian.rh.jdbc.DataSourceHolder;
import com.brian.rh.jdbc.orm.mybatis.model.User;
import com.brian.rh.jdbc.spring.utils.ApplicationContextUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhouxinye
 * @Date: 2018/11/14 13:08
 * @Version 1.0
 */
public class MyBatis {
    public static void main(String[] args) throws Exception {
        DataSourceHolder.setDataSourceType("oracleDataSource");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
        //SqlSession session = sqlSessionFactory.openSession();
        //Object o = session.selectOne("userMapper.getUserById",1);
        //UserMapper userMapper = session.getMapper(UserMapper.class);
        //User user = userMapper.getUserById(1L);
        //User user = session.selectOne("com.brian.rh.jdbc.orm.mybatis.mapper.UserMapper.getUserById", 1);

        ApplicationContext ioc = ApplicationContextUtils.getApplicationContext();
        SqlSessionFactoryBean sqlSessionFactoryBean = ioc.getBean(SqlSessionFactoryBean.class);
        SqlSession sqlSession = ioc.getBean(SqlSessionTemplate.class);
        //SqlSessionFactory sessionFactory = sqlSessionFactoryBean.getObject();
        //SqlSession sqlSession = sessionFactory.openSession();
        User user = sqlSession.selectOne("com.brian.rh.jdbc.orm.mybatis.mapper.UserMapper.getUserById", 2);
        User o = sqlSession.selectOne("com.brian.rh.jdbc.orm.mybatis.mapper.UserMapper.getUserById", 2);
        //System.out.print(o);

        JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from t_user");
        for(Map<String, Object> map : maps){
            System.out.println(map.get("ID"));
        }
    }
}
