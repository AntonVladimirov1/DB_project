package com.cydeo.jdbcTests.Day02;

import com.cydeo.jdbcTests.Utility.DB_Utility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Library_Test {

    String libraryUrl= "jdbc:mysql://34.230.35.214:3306/library2";
    String libraryUserName= "library2_client";
    String libraryPassword= "6s2LQQTjBcGFfDhY";


    @Test
    public void task1(){

        DB_Utility.createConnection(libraryUrl,libraryUserName,libraryPassword);

        DB_Utility.runQuery("select count(*) from books");

        String expBookCount = "11620";
        String actBookCount = DB_Utility.getFirstRowFirstColumn();

        Assertions.assertEquals(expBookCount,actBookCount);
        System.out.println(actBookCount+" - "+expBookCount);


        DB_Utility.destroy();

    }

}
