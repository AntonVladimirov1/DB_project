
    --there is a folder "view" created --->
    CREATE VIEW Personal_Info as
    select first_name||' '||LAST_NAME as "Full Name" from employees;

    CREATE or replace VIEW Personal_Info as
    select first_name||' '||LAST_NAME as "Full Name",SALARY*12 as "Annual salary" from employees;

    select "Full Name" from Personal_Info; --able to retrieve data from virtual table "Personal_Info"

    drop view Personal_Info;