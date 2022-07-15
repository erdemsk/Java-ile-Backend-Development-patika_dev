--Sixth assignment of SQL Module by patika.dev https://app.patika.dev/courses/sql/Odev6
--1. What is the average of the values in the rental_rate column in the film table?
--SELECT AVG(rental_rate) FROM film;

--2.How many of the movies in the film table start with the character 'C'?
--SELECT COUNT(*) FROM film
--WHERE title ILIKE 'C%';

--3. Among the movies in the film table, how many minutes is the longest movie with a rental_rate equal to 0.99?
--SELECT MAX(length) FROM film
--WHERE rental_rate = 0.99

--4.How many different replacement_cost values are there for the movies longer than 150 minutes in the film table?
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;