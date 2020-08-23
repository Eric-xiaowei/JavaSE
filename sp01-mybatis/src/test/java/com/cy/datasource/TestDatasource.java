package com.cy.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/19-16:33
 */
@SpringBootTest
public class TestDatasource {
    @Autowired
    private DataSource dataSource;

    //测试数据库连接是否成功：
    @Test
    void testDataource() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection.getClass().getSimpleName());
    }
}
