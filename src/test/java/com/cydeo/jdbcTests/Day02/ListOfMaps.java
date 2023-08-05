package com.cydeo.jdbcTests.Day02;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.*;

public class ListOfMaps {

    String dbUrl= "jdbc:oracle:thin:@ 54.82.83.115 :1521:XE";
    String dbUserName= "hr";
    String dbPassword= "hr";

    @Test
    public void task1(){

        // Creating Map (to keep key pair) for each row
        Map <String,Object> rowMap1 = new HashMap<>(); // first row
        rowMap1.put("FIRST_NAME","Steven");
        rowMap1.put("LAST_NAME","King");
        rowMap1.put("SALARY",24000);

        Map <String,Object> rowMap2 = new HashMap<>(); // second row
        rowMap2.put("FIRST_NAME","Nina");
        rowMap2.put("LAST_NAME","Kochhar");
        rowMap2.put("SALARY",17000);

        // Creating List of all row Maps
        List<Map<String,Object>> dataList = new ArrayList<>(); // or like this -->(Arrays.asList(rowMap1,rowMap2));
        dataList.add(rowMap1);
        dataList.add(rowMap2);
        System.out.println(dataList);

        // To retrieve specific data from our list:  list.get(index of the row).get(key word from Map)
        System.out.println(dataList.get(0).get("LAST_NAME"));

    }

    @Test
    public void task2() throws SQLException {

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("select FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES where rownum<6");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();

        rs.next(); // we need to move to the first row to fill out rowMap1
        Map <String,Object> rowMap1 = new HashMap<>(); // first row
        rowMap1.put(rsmd.getColumnName(1),rs.getString(1));
        rowMap1.put(rsmd.getColumnName(2),rs.getString(2));
        rowMap1.put(rsmd.getColumnName(3),rs.getInt(3));

        rs.next();
        Map <String,Object> rowMap2 = new HashMap<>(); // second row
        rowMap2.put(rsmd.getColumnName(1),rs.getString(1));
        rowMap2.put(rsmd.getColumnName(2),rs.getString(2));
        rowMap2.put(rsmd.getColumnName(3),rs.getInt(3));

        rs.next(); // we need to move to the first row to fill out rowMap1
        Map <String,Object> rowMap3 = new HashMap<>(); // first row
        rowMap3.put(rsmd.getColumnName(1),rs.getString(1));
        rowMap3.put(rsmd.getColumnName(2),rs.getString(2));
        rowMap3.put(rsmd.getColumnName(3),rs.getInt(3));

        // Creating List of all row Maps
        List<Map<String,Object>> dataList = new ArrayList<>(); // or like this -->(Arrays.asList(rowMap1,rowMap2));
        dataList.add(rowMap1);
        dataList.add(rowMap2);
        dataList.add(rowMap3);
        System.out.println(dataList);

        // To retrieve specific data from our list:  list.get(index of the row).get(key word from Map)
        System.out.println(dataList.get(0).get("LAST_NAME"));

        rs.close();
        statement.close();
        conn.close();
    }

    @Test
    public void task3() throws SQLException {

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = statement.executeQuery("select FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES");
        ResultSetMetaData rsmd = rs.getMetaData();

            // Creating List of Maps to keep info
        List<Map<String,Object>> dataList = new ArrayList<>();
        int columnCount = rsmd.getColumnCount();
            // iterate through each row
        while(rs.next()){
            // created an empty Map to hold one row info
            Map<String,Object> rowMap = new HashMap<>();
            // iterate each column dynamically to fill out the Map
            for (int i = 1; i <= columnCount; i++) {
                rowMap.put(rsmd.getColumnName(i),rs.getString(i));
            }
            // adding the one row info to the List
           dataList.add(rowMap);
        }
        // just to print all rows correctly
      for (Map<String, Object> row : dataList) {
            System.out.println(row);
        }


        rs.close();
        statement.close();
        conn.close();

    }

}
