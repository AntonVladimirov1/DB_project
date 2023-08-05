
    select * from EMPLOYEES e left outer join  DEPARTMENTS d
                   on e.DEPARTMENT_ID = d.DEPARTMENT_ID and e.EMPLOYEE_ID = d.MANAGER_ID;

    select e.FIRST_NAME,e.LAST_NAME, d.LOCATION_ID from EMPLOYEES e left outer join DEPARTMENTS d
                                                on e.DEPARTMENT_ID = d.DEPARTMENT_ID and e.EMPLOYEE_ID = d.MANAGER_ID;