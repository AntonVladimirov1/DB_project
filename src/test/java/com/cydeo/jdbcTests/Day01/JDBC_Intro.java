package com.cydeo.jdbcTests.Day01;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JDBC_Intro {

    // CONNECTION STRING
    String dbUrl= "jdbc:oracle:thin:@ 54.82.83.115 :1521:XE";
    String dbUserName= "hr";
    String dbPassword= "hr";

    @Test
    public void task1() throws SQLException {

        // Create CONNECTION
        // DriverManager class getConnection method will help us to connect database
        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        // It will help us to execute queries
        Statement statement = conn.createStatement();

        // ResultSet will store data after execution. It stores only data(there is no table info)
        ResultSet rs = statement.executeQuery("select * from departments where MANAGER_ID is not null");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" - "+rs.getString(2)+" - "+ rs.getInt(3)+" - "+rs.getString(4));
        }
        System.out.println("--------------------------------------------------------");

        // TO RUN another query in same connection (just assign rs variable to the new query)
       rs = statement.executeQuery("select * from LOCATIONS");
        while (rs.next()){
            System.out.println(rs.getString(2)+" - "+rs.getString(4));
        }



        // close connection ( will need to be closed after each usage)
        rs.close();
        statement.close();
        conn.close();
    }
}
