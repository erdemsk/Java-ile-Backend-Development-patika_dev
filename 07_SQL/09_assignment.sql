-- Ninth assignment of SQL module by patika.dev https://app.patika.dev/courses/sql/Odev9
--1. Write the INNER JOIN query where we can see the city and country names in the city table and the country table together.
--SELECT city, country
--FROM city
--INNER JOIN country
--ON city.country_id = country.country_id;

--2.Write the INNER JOIN query where we can see the first_name and last_name values with the payment_id column that is both located in the customer table and payment table together.
--SELECT customer.first_name, customer.last_name, payment.payment_id 
--FROM customer
--INNER JOIN payment
--ON customer.customer_id = payment.customer_id;

--3. Write the INNER JOIN query where we can see the first_name and last_name values with the rental_id column that is both located in the customer table and rental table together.
SELECT customer.first_name, customer.last_name, rental.rental_id 
FROM customer
INNER JOIN rental
ON customer.customer_id = rental.customer_id;