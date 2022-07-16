--Eleventh assignment of SQL Module by patika.dev https://app.patika.dev/courses/sql/Odev11
--1. List all the datas for the first_name column of actor and customer tables
/*(
SELECT first_name
FROM actor
)
UNION -- Use UNION ALL to see the repeated data
(
SELECT first_name
FROM customer
)*/

--2. List the intersecting values in the first_name column of actor and customer tables
/*(
SELECT first_name 
FROM actor
)
INTERSECT --Use INTERSECT ALL to see the repeated data
(
SELECT first_name
FROM customer
)*/

--3. List the first_name values of the data that is located in the actor table but not in the customer table
(
SELECT first_name
FROM actor
)
EXCEPT -- Use EXCEPT ALL to see repeated data
(
SELECT first_name
from customer
)