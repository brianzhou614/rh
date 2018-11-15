package com.brian.rh.jdbc;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: zhouxinye
 * @Date: 2018/11/13 15:40
 * @Version 1.0
 */
public class RoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSourceType();
    }
}
