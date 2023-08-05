package com.cydeo.jdbcTests.Day02;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class MetaData_continue {

    String dbUrl= "jdbc:oracle:thin:@ 54.82.83.115 :1521:XE";
    String dbUserName= "hr";
    String dbPassword= "hr";

    @Test
    public void task1() throws SQLException {

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("select FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES where rownum<6");


        // ResultSetMetaData
        ResultSetMetaData rsmd = rs.getMetaData();

        // column count
        int columnCount = rsmd.getColumnCount();

               // DYNAMICALLY retrieve all data from the table

        while(rs.next()){
            //System.out.println(rsmd.getColumnName(1) + "-" + rs.getString(1)+" | "+rsmd.getColumnName(2) + "-" + rs.getString(2))......; --> manually
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsmd.getColumnName(i)+"-"+rs.getString(i)+" ");
            }
            System.out.println();
        }


        // close connection
        rs.close();
        statement.close();
        conn.close();
    }

}
