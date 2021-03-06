--SQL Module 1. Assignment by patika.dev https://app.patika.dev/courses/sql/Odev1 

--1. Sort the data in the title and description columns in the film table.
--SELECT title, description FROM film;

--2. Sort the data in all columns in the film table with the movie length greater than 60 AND less than 75.
--SELECT * FROM film
--WHERE length < 75 AND length > 60;

--3. Sort the data in all columns in the film table with rental_rate 0.99 AND replacement_cost 12.99 OR 28.99.
--SELECT * FROM film
--WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);

--4. What is the value in the last_name column of the customer whose value is 'Mary' in the first_name column of the customer table?
--SELECT last_name from customer
--WHERE first_name = 'Mary';

--5. Sort the data in the film table that their length is not longer than 50 but also has a rental_rate of 2.99 or 4.99.
SELECT * FROM film
WHERE length <= 50 AND (rental_rate <> 2.99 AND rental_rate <> 4.99);