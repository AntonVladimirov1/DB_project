
    select * from employees
    order by SALARY desc;

    select max(SALARY) from EMPLOYEES;
    -- then we can do nested select
    select * from EMPLOYEES where SALARY =(select max(SALARY) from EMPLOYEES);

    select DEPARTMENT_ID from DEPARTMENTS where DEPARTMENT_NAME='IT';

    -- then we can insert above query into below query - will be dynamic (to find another department just change name of it)
    select FIRST_NAME,LAST_NAME from EMPLOYEES where DEPARTMENT_ID=(select DEPARTMENT_ID from DEPARTMENTS where DEPARTMENT_NAME='IT');
