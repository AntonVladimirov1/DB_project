
    select * from employees;
    select * from DEPARTMENTS;
    select * from LOCATIONS;

    select * from EMPLOYEES inner join DEPARTMENTS
        on EMPLOYEES.DEPARTMENT_ID=DEPARTMENTS.DEPARTMENT_ID;

    select e.first_name,e.last_name,d.department_name,c.COUNTRY_NAME
    from EMPLOYEES e inner join DEPARTMENTS d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
                     inner join LOCATIONS l on d.LOCATION_ID=l.LOCATION_ID
                     inner join COUNTRIES c on l.COUNTRY_ID=c.COUNTRY_ID
    order by DEPARTMENT_NAME;


    SELECT e.first_name, e.last_name, p.project_id
    FROM employees e JOIN employees_projects p ON e.id = p.employee_id
    ORDER BY e.last_name DESC;