-- Tenth assignment of SQL Module by patika.dev https://app.patika.dev/courses/sql/Odev10
--1. Write a LEFT JOIN query that we can see both the city and country names that are located in the city and country tables
--SELECT city.city, country.country 
--FROM city
--LEFT JOIN country
--ON city.country_id = country.country_id;

--2. Write a RIGHT JOIN query that we can see first_name and last_name columns together with the customer_id column that is both located in the customer and payment tables
--SELECT customer.first_name, customer.last_name
--FROM customer
--RIGHT JOIN payment
--ON customer.customer_id = payment.customer_id;

--3. Write a FULL JOIN query with the customer_id column that is both loated in the customer and rental tables to extract the first_name and last_name columns of customer table
SELECT first_name, last_name
FROM customer
FULL JOIN rental
ON customer.customer_id = rental.customer_id;