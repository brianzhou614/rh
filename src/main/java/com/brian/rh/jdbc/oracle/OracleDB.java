package com.brian.rh.jdbc.oracle;

import com.brian.rh.jdbc.DataSourceHolder;
import com.brian.rh.jdbc.spring.utils.ApplicationContextUtils;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @Author: zhouxinye
 * @Date: 2018/11/13 13:01
 * @Version 1.0
 */
public class OracleDB {

    public static void main(String[] args){
        ApplicationContext applicationContext = ApplicationContextUtils.getApplicationContext();
        DataSourceHolder.setDataSourceType("oracleDataSource");
        DataSource dataSource = (DataSource)applicationContext.getBean("dataSource");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            System.out.print(connection);
            preparedStatement = connection.prepareStatement("select * from t_user");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString("username"));
             }

        } catch (SQLException e) {
            e.printStackTrace();
        } /*finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }
}
