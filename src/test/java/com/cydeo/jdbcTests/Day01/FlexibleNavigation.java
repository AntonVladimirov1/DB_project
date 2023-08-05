package com.cydeo.jdbcTests.Day01;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class FlexibleNavigation {

    // CONNECTION STRING
    String dbUrl= "jdbc:oracle:thin:@ 54.82.83.115 :1521:XE";
    String dbUserName= "hr";
    String dbPassword= "hr";

    @Test
    public void task1() throws SQLException {

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        // adding conditions in this method to be able to use other different methods
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("select first_name,last_name from employees");

        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getString(2));
        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getString(2));

        // last method to jump direct to the last row
        rs.last();
        System.out.println(rs.getString(1)+" "+rs.getString(2));

        // how many rows we have
        int rowNumber = rs.getRow();
        System.out.println("rowNumber = "+ rowNumber);

        // jump to the specific row
        rs.absolute(46);
        System.out.println(rs.getString(1)+" "+rs.getString(2));

        // jump to previous row
        rs.previous();
        System.out.println(rs.getString(1)+" "+rs.getString(2));
        System.out.println("-----------------------------------------------------");

        rs.first(); // jumps to the first row

        rs.beforeFirst(); // jumps to the default "0" position
        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }


        // close connection
        rs.close();
        statement.close();
        conn.close();
    }

}
