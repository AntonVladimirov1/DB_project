
   -- ROWNUM cuts the whole table info to desired number of rows(lines)
    select * from employees where ROWNUM<=5;
           -- we want to find highest top 5 salary
    select * from EMPLOYEES where ROWNUM<=5 order by SALARY desc; -- not a good way, this query ordering after top5 rows not highest

    select * from (select * from EMPLOYEES order by SALARY desc) where ROWNUM<=7; -- this is correct

    select * from EMPLOYEES where SALARY=(select min(SALARY) from (select distinct SALARY from EMPLOYEES order by SALARY desc)
                                                             where ROWNUM<=7);
