
    --column Aliases
    select FIRST_NAME||' '||LAST_NAME as "Full Name" from EMPLOYEES;
    select concat(EMAIL,'@gmail.com') as "Email adrress" from EMPLOYEES;

    --table Aliases (just named the table like - "e" or "d")
    select e.FIRST_NAME,e.LAST_NAME,d.DEPARTMENT_NAME from EMPLOYEES e,DEPARTMENTS d where DEPARTMENT_NAME='Marketing';