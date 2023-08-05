package com.cydeo.jdbcTests.Day01;

import java.sql.*;

public class TestOracleConnection {

    public static void main(String[] args) throws SQLException {
            // CONNECTION STRING
        String dbUrl= "jdbc:oracle:thin:@ 54.82.83.115 :1521:XE";
        String dbUserName= "hr";
        String dbPassword= "hr";

        // Create CONNECTION
        // DriverManager class getConnection method will help us to connect database
        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        // It will help us to execute queries
        Statement statement = conn.createStatement();

        // ResultSet will store data after execution. It stores only data(there is no table info)
        ResultSet rs = statement.executeQuery("select * from REGIONS");


       /* // Getting DATA
        rs.next(); // moves pointer down on vertical
        System.out.println("------------1st Row-----------------");
        // now pointer is in the first row.

        // rs.getInt --> returns integer (column indexes)
        System.out.println(rs.getInt(1)+ " "+ rs.getString(2));

        // same info - different approach (column names)
        System.out.println(rs.getInt("REGION_ID")+ " "+ rs.getString("REGION_NAME"));

        rs.next(); // moves pointer down on vertical
        System.out.println("------------2nd Row-----------------");
        System.out.println(rs.getInt(1)+ " "+ rs.getString(2));

        rs.next(); // moves pointer down on vertical
        System.out.println("------------3nd Row-----------------");
        System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
        System.out.println("------------------------------------------");

        */

            // fancy style of next method - All rows reading till the end
        while(rs.next()){
            System.out.println(rs.getInt(1)+ " - "+ rs.getString(2));
        }





        // close connection ( will need to be closed after each usage)
        rs.close();
        statement.close();
        conn.close();


    }

}
