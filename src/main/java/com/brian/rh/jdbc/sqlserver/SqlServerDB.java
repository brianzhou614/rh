package com.brian.rh.jdbc.sqlserver;

import com.brian.rh.jdbc.DataSourceHolder;
import com.brian.rh.jdbc.spring.utils.ApplicationContextUtils;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: zhouxinye
 * @Date: 2018/11/13 16:02
 * @Version 1.0
 */
public class SqlServerDB {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = ApplicationContextUtils.getApplicationContext();
        DataSourceHolder.setDataSourceType("sqlServerDataSource");
        DataSource dataSource = (DataSource)applicationContext.getBean("dataSource");

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from biz.car.carinfo where carnumber = '浙AB70D5'");
        while(resultSet.next()){
            System.out.println(resultSet.getString("carnumber"));
        }

    }
}
