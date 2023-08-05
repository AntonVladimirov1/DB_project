
select * from EMPLOYEES e right outer join  DEPARTMENTS d
                                           on e.DEPARTMENT_ID = d.DEPARTMENT_ID;

select e.FIRST_NAME,e.LAST_NAME,d.LOCATION_ID,d.DEPARTMENT_NAME from EMPLOYEES e right outer join  DEPARTMENTS d
                                            on e.DEPARTMENT_ID = d.DEPARTMENT_ID;