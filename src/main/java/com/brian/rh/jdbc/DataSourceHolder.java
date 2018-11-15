package com.brian.rh.jdbc;

/**
 * @Author: zhouxinye
 * @Date: 2018/11/13 16:22
 * @Version 1.0
 */
public class DataSourceHolder {
    private static volatile String dataSourceType;

    /**
     * @Description: 设置数据源类型
     * @param dataSourceType  数据库类型
     * @return void
     * @throws
     */
    public static void setDataSourceType(String dataSourceType) {
        DataSourceHolder.dataSourceType = dataSourceType;
    }

    /**
     * @Description: 获取数据源类型
     * @param
     * @return String
     * @throws
     */
    public static String getDataSourceType() {
        return  DataSourceHolder.dataSourceType;
    }

    /**
     * @Description: 清除数据源类型
     * @param
     * @return void
     * @throws
     */
    public static void clearDataSourceType() {
        DataSourceHolder.dataSourceType = null;
    }
}
