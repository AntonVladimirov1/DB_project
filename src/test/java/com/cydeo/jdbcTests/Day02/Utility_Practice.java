package com.cydeo.jdbcTests.Day02;

import com.cydeo.jdbcTests.Utility.DB_Utility;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Utility_Practice {

    @Test
    public void task1(){
            // create connection method
        DB_Utility.createConnection();

        DB_Utility.runQuery("select * from employees");

        System.out.println(DB_Utility.getFirstRowFirstColumn());
        System.out.println("----------------------------------------------");
        System.out.println(DB_Utility.getAllColumnNamesAsList());
        System.out.println("----------------------------------------------");
        System.out.println(DB_Utility.getColumnDataAsList(2));
        System.out.println("----------------------------------------------");
        System.out.println(DB_Utility.getRowDataAsList(2));
        System.out.println("----------------------------------------------");

        for (Map<String, String> rowMap : DB_Utility.getAllRowAsListOfMap()) {
            System.out.println(rowMap);
        }


        // close connection method
        DB_Utility.destroy();

    }

}
