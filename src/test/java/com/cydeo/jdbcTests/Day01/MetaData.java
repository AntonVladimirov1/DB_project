package com.cydeo.jdbcTests.Day01;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class MetaData {

    // CONNECTION STRING
    String dbUrl= "jdbc:oracle:thin:@ 54.82.83.115 :1521:XE";
    String dbUserName= "hr";
    String dbPassword= "hr";

    @Test
    public void task1() throws SQLException {

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("select * from DEPARTMENTS");

        //DatabaseMetaData
        DatabaseMetaData dbMetaData = conn.getMetaData();
        System.out.println(dbMetaData.getUserName());
        System.out.println(dbMetaData.getDatabaseProductName());
        System.out.println(dbMetaData.getDatabaseProductVersion());
        System.out.println(dbMetaData.getDriverName());
        System.out.println("-----------------------------------------");

        // ResultSetMetaData
        ResultSetMetaData rsmd = rs.getMetaData();

        // column count
        int columnCount = rsmd.getColumnCount();
        System.out.println(columnCount);

        // column name
        System.out.println(rsmd.getColumnName(2));

        System.out.println("-----------Column Names----------------");
        // to get all column names
        for (int i = 1; i < columnCount; i++) {
            System.out.println(rsmd.getColumnName(i));
        }


        // close connection
        rs.close();
        statement.close();
        conn.close();
    }

}
