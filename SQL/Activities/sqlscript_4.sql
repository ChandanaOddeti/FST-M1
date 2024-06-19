REM   Script: Session 05
REM   Activity 9- 10

Select * from salesman;

Select * from orders;

Select * from orders;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

Select * from orders;

Create TABLE Salesman (salesman_id, int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

INSERT ALL   
    into Salesman values (5001,'James Hoog','New York',15)  
    into Salesman values (5002, 'Nail Knite', 'Paris', 13)  
    into Salesman values (5005, 'Pit Alex', 'London', 11)   
    into Salesman values (5006, 'McLyon', 'Paris', 14)  
    into Salesman values (5007, 'Paul Adam', 'Rome', 13)  
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12)  
Select 1 from dual;

Select * from Salesman;

Create TABLE Salesman (salesman_id int, salesman_name varchar2(20), salesman_city varchar(15),commission int);

INSERT ALL   
    into Salesman values (5001,'James Hoog','New York',15)  
    into Salesman values (5002, 'Nail Knite', 'Paris', 13)  
    into Salesman values (5005, 'Pit Alex', 'London', 11)   
    into Salesman values (5006, 'McLyon', 'Paris', 14)  
    into Salesman values (5007, 'Paul Adam', 'Rome', 13)  
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12)  
Select 1 from dual;

Select * from Salesman;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

Select * from customers ;

Select a.customer_id,b.salesman_name from orders a inner join salesman b on a.salesman_id = b.salesman_id;

Select b.salesman_name,c.customer_name from salesman b inner join customers c on b.salesman_id = c.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

Select b.salesman_name,c.customer_name from salesman b inner join customers c on b.salesman_id = c.salesman_id;

Select b.salesman_name,c.customer_name,b.salesman_city from salesman b inner join customers c on b.salesman_id = c.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

Select * from salesman;

Select * from orders;

Select * from orders;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

Select * from orders;

Create TABLE Salesman (salesman_id, int, salesman_name  varchar2(20), salesman_city varchar(15),commission int);

INSERT ALL   
    into Salesman values (5001,'James Hoog','New York',15)  
    into Salesman values (5002, 'Nail Knite', 'Paris', 13)  
    into Salesman values (5005, 'Pit Alex', 'London', 11)   
    into Salesman values (5006, 'McLyon', 'Paris', 14)  
    into Salesman values (5007, 'Paul Adam', 'Rome', 13)  
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12)  
Select 1 from dual;

Select * from Salesman;

Create TABLE Salesman (salesman_id int, salesman_name varchar2(20), salesman_city varchar(15),commission int);

INSERT ALL   
    into Salesman values (5001,'James Hoog','New York',15)  
    into Salesman values (5002, 'Nail Knite', 'Paris', 13)  
    into Salesman values (5005, 'Pit Alex', 'London', 11)   
    into Salesman values (5006, 'McLyon', 'Paris', 14)  
    into Salesman values (5007, 'Paul Adam', 'Rome', 13)  
    into Salesman values(5003, 'Lauson Hen', 'San Jose', 12)  
Select 1 from dual;

Select * from Salesman;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

Select * from customers ;

Select a.customer_id,b.salesman_name from orders a inner join salesman b on a.salesman_id = b.salesman_id;

Select b.salesman_name,c.customer_name from salesman b inner join customers c on b.salesman_id = c.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

Select b.salesman_name,c.customer_name from salesman b inner join customers c on b.salesman_id = c.salesman_id;

Select b.salesman_name,c.customer_name,b.salesman_city from salesman b inner join customers c on b.salesman_id = c.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12 
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city,b.commission FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city,b.commission FROM customers a   
Inner JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city,b.commission FROM customers a   
Inner JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT a.customer_name, a.city, b.salesman_name, b.salesman_city FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id;

SELECT a.customer_name as "Customer Name", a.city, b.salesman_name as "Salesman Name", b.salesman_city as "Salesman City" FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id 
;

SELECT a.customer_name as "Customer Name", a.city, b.salesman_name as "Salesman Name", b.salesman_city as "Salesman City", b.commission FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id 
;

SELECT a.customer_name as "Customer Name", a.city, b.salesman_name as "Salesman Name", b.salesman_city as "Salesman City", b.commisson FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id 
;

SELECT a.customer_name as "Customer Name", a.city, b.salesman_name as "Salesman Name", b.salesman_city as "Salesman City", b.commission FROM customers a   
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12  
ORDER BY a.customer_id 
;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

Select order_no, purchase amount,order date from orders where (Select salesman_id from customers where customer_id = 3007)  group by salesman_id;

Select order_no, purchase amount,order date from orders where (Select salesman_id from customers where customer_id = 3007)  order by salesman_id;

Select order_no, purchase amount,order_date from orders where (Select salesman_id from customers where customer_id = 3007)  order by salesman_id;

Select order_no, purchase amount,order_date from orders where salesman_id =(Select salesman_id from customers where customer_id = 3007)  order by salesman_id;

Select order_no, purchase_amount,order_date from orders where salesman_id =(Select salesman_id from customers where customer_id = 3007)  order by salesman_id;

Select order_no, purchase_amount,order_date from orders where salesman_id =(Select salesman_id from customers where customer_id = 3007)  order by customer_id;

Select * from orders where salesman_id =(Select salesman_id from customers where customer_id = 3007)  order by customer_id;

Select * from orders where salesman_id =(Select salesman_id from customers where customer_id = 3007);

Select * from orders where salesman_id =(Select distinct salesman_id from customers where customer_id = 3007);

Select * from orders where salesman_id =(Select distinct salesman_id from customers where customer_id = 3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

Select * from orders where salesman_id =(Select distinct salesman_id from orders where customer_id = 3007);

Select * from orders where salesman city = (selct salesman_name from salesman where salesmansalesman_city = "Newyork");

Select * from orders in (select salesman_name from salesman where salesmansalesman_city = 'Newyork');

Select * from orders where salesman_id in (select salesman_name from salesman where salesmansalesman_city = 'Newyork');

Select * from orders where salesman_id in (select salesman_name from salesman where salesman_city = 'Newyork');

Select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = 'Newyork');

Select * from orders where salesman_id in (select salesman_id from Salesman where salesman_city = 'Newyork');

Select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = "Newyork");

Select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = "New york");

Select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = 'New York');

Select * from orders where salesman_id in (select salesman_name from salesman where salesman_city = 'New York');

Select * from orders where salesman_name in (select salesman_name from salesman where salesman_city = 'New York');

Select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = 'New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM salesman WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT grade, COUNT(*),city FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

