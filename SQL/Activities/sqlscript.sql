REM   Script: Session 01
REM   Activity 1-5

Create TABLE Salesman ( 
    salesman_id     , int 
    salesman_name, varchar2(32) 
    salesman_city, varchar(32) 
    commission, int 
);

Create TABLE Salesman (salesman_id, int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

Describe Salesman 


Create TABLE Salesman(salesman_id int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

Describe Salesman 


Create TABLE Salesman(salesman_id int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

Describe Salesman 


INSERT ALL  
    into Salesman values (5001,'James Hoog','New York',15) 
    into Salesman values (5002, 'Nail Knite', 'Paris', 13) 
    into Salesman values (5005, 'Pit Alex', 'London', 11)  
    into Salesman values (5006, 'McLyon', 'Paris', 14) 
    into Salesman values (5007, 'Paul Adam', 'Rome', 13) 
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12) 
Select 1 from dual;

Drop table Salesman 
Create TABLE Salesman(salesman_id int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

Describe Salesman 


INSERT ALL  
    into Salesman values (5001,'James Hoog','New York',15) 
    into Salesman values (5002, 'Nail Knite', 'Paris', 13) 
    into Salesman values (5005, 'Pit Alex', 'London', 11)  
    into Salesman values (5006, 'McLyon', 'Paris', 14) 
    into Salesman values (5007, 'Paul Adam', 'Rome', 13) 
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12) 
Select 1 from dual;

Drop table Salesman;

Create TABLE Salesman(salesman_id int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

Describe Salesman 


INSERT ALL  
    into Salesman values (5001,'James Hoog','New York',15) 
    into Salesman values (5002, 'Nail Knite', 'Paris', 13) 
    into Salesman values (5005, 'Pit Alex', 'London', 11)  
    into Salesman values (5006, 'McLyon', 'Paris', 14) 
    into Salesman values (5007, 'Paul Adam', 'Rome', 13) 
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12) 
Select 1 from dual;

Drop table Salesman;

Create TABLE Salesman(salesman_id int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

Describe Salesman 


INSERT ALL  
    into Salesman values (5001,'James Hoog','New York',15) 
    into Salesman values (5002, 'Nail Knite', 'Paris', 13) 
    into Salesman values (5005, 'Pit Alex', 'London', 11)  
    into Salesman values (5006, 'McLyon', 'Paris', 14) 
    into Salesman values (5007, 'Paul Adam', 'Rome', 13) 
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12) 
Select 1 from dual;

Select * from Salesman;

Select salesman_id,salesman_city from Salesman;

Select * from Salesman where salesman_city = 'Paris';

Select salesman_id, commission from Salesman where salesman_name = 'Paul Adam';

ALTER TABLE Salesman 
Add (grade int );

Update Salesman SET grade = 100;

Select * from Salesman;

Update Salesman SET grade = 200 where salesman_city = 'Rome';

Select * from Salesman where salesman_city = 'Rome';

Select * from Salesman where salesman_name = 'James Hoog';

Update Salesman SET grade = 200 where salesman_city = 'Rome';

Select * from Salesman where salesman_city = 'Rome';

Update Salesman SET grade = 300 where salesman_name = 'James Hoog';

Select * from Salesman where salesman_name = 'James Hoog';

UPDATE Salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

Select * from Salesman where salesman_name = 'McLyon';

UPDATE Salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

Select * from Salesman where salesman_name = 'Pierre';

