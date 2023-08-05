    select FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES where SALARY between 13000 and 20000;

    select * from EMPLOYEES where FIRST_NAME in('Neena','Karen');

    select * from EMPLOYEES;

    select count(*) from EMPLOYEES where JOB_ID='IT_PROG';

    select * from COUNTRIES where COUNTRY_NAME like 'B%';

    select max(SALARY) from EMPLOYEES;

    select sum(SALARY) from EMPLOYEES where JOB_ID='IT_PROG';

    select JOB_ID,count(*) from EMPLOYEES group by JOB_ID;
    select JOB_ID,max(SALARY) from EMPLOYEES group by JOB_ID;

    select JOB_ID,count(*),max(SALARY),min(SALARY),avg(SALARY) from EMPLOYEES group by JOB_ID;

    --update HR.EMPLOYEES set LAST_NAME = 'KAKASHKA' where EMPLOYEE_ID='100';

    select * from EMPLOYEES;
select distinct SALARY from EMPLOYEES order by SALARY;
select max(SALARY) from (select distinct SALARY from EMPLOYEES order by SALARY) where ROWNUM<=3;
    select * from EMPLOYEES
    where SALARY=(select max(SALARY) from (select distinct SALARY from EMPLOYEES order by SALARY) where ROWNUM<=3);

    select * from EMPLOYEES , DEPARTMENTS order by SALARY;

select * from SDET;
update sdet set FULLNAME ='Antonio' where EMPLOYEEID=1;
commit;






