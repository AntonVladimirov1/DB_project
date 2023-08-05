
    select * from employees;
      -- concatenation sign: ||
    select FIRST_NAME||' '||LAST_NAME from EMPLOYEES;

    select EMAIL||'@gmail.com'from EMPLOYEES;

    select concat(concat(FIRST_NAME,' '),LAST_NAME) from EMPLOYEES;
    select concat(EMAIL,'@gmail.com') from EMPLOYEES; --

    select upper(FIRST_NAME) from EMPLOYEES;
    select lower(FIRST_NAME) from EMPLOYEES;
    select initcap(FIRST_NAME) from EMPLOYEES; --first letter Uppercase

    select FIRST_NAME, length(FIRST_NAME) from EMPLOYEES;

            --(columnName,beginningIndex,numberOfChar)
            --if the beginningIndex 0, it's treated as 1.
    select substr(FIRST_NAME,0,1)||'.'||substr(LAST_NAME,0,1)||'.' from EMPLOYEES;
    select substr(FIRST_NAME,1,1)||'.'||substr(LAST_NAME,1,1)||'.' from EMPLOYEES;