
     create table SDET
        (
        EmployeeID integer primary key ,
        FullName varchar(50) not null ,
        Email varchar(20) unique ,
        Age integer check ( Age>18 ),
        Salary integer default 120000
        );

    select * from SDET;

    insert into SDET(employeeid, fullname, email, age) VALUES (01,'Anton Vladimirov','antonio@gmail.com',35);
     insert into SDET(employeeid, fullname, email, age) VALUES (02,'Vasya Pupkin','vasya@gmail.com',25);
     insert into SDET(employeeid, fullname, email, age) VALUES (03,'Zopka Pupkin','zopka@gmail.com',27);
     insert into SDET(employeeid, fullname, email, age) VALUES (04,'Pukalka Pupkin','pukalka@gmail.com',30);

    -- to save changes in database we need to commit it;
    commit;

    update SDET set SALARY='110000' where EMPLOYEEID='4';
    alter table  SDET drop column "Status";
    alter table SDET rename column EMAIL to EmailAddress;

    -- to clean all records in the table - truncate (truncate table .....;)
    -- to delete table - drop (drop table ....;)