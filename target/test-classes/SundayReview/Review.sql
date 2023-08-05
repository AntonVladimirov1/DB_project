
    select * from employees;
         -- MOD - works like reminder sign
select EMPLOYEE_ID,FIRST_NAME,LAST_NAME from EMPLOYEES where mod(EMPLOYEE_ID,2)=0;

select FIRST_NAME,LAST_NAME,avg(SALARY) from employees group by FIRST_NAME,LAST_NAME ;