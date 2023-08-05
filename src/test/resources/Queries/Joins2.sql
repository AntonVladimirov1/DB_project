select region_name,count(country_name) from regions r join countries c
on r.region_id = c.region_id
group by region_name;

select FIRST_NAME,LAST_NAME,COUNTRY_NAME from
EMPLOYEES e join DEPARTMENTS d on e.DEPARTMENT_ID=d.DEPARTMENT_ID
join LOCATIONS l on d.LOCATION_ID = l.LOCATION_ID
join COUNTRIES C2 on l.COUNTRY_ID = C2.COUNTRY_ID;