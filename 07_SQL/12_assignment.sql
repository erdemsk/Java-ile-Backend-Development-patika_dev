--Twelfth Assignment of SQL Module by patika.dev https://app.patika.dev/courses/sql/Odev12
--1. How many movies are there in the film table that their lenght is greater than the average movie length
/*SELECT COUNT(*) 
FROM film
WHERE length >
(
SELECT AVG(length)
FROM film);*/

--2. How many films are there in the film table that has the highest rental_rate value
/*SELECT COUNT(*)
FROM film
WHERE rental_rate = ANY
(
SELECT MAX(rental_rate)
FROM film
)*/

--3. List the movies in the film table with the lowest rental_rate and lowest replacement_cost values
/*SELECT * 
FROM film 
WHERE rental_rate = 
(
    SELECT MIN(rental_rate) 
    FROM film
)
AND 
replacement_cost = 
(
    SELECT MIN(replacement_cost) 
    FROM film
);*/

--4. List the most frequent spending customers on the payment table
SELECT customer.first_name, customer.last_name
FROM customer
INNER JOIN payment 
ON customer.customer_id = ANY
(
    SELECT customer_id 
    FROM payment
    GROUP BY customer_id 
    ORDER BY COUNT(customer_id) DESC
    LIMIT 100
)
LIMIT 100;