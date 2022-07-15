-- Seventh assignment of SQL Module by patika.dev https://app.patika.dev/courses/sql/Odev7
--1. Group the movies in the film table according to their rating values.
--SELECT title, rating 
--FROM film
--GROUP BY title, rating
--ORDER BY rating ASC

--2. When the films in the film table are grouped according to the replacement cost column, list the replacement_cost value with more than 50 films and the corresponding number of films.
--SELECT replacement_cost, COUNT(replacement_cost) 
--FROM film
--GROUP BY replacement_cost
--HAVING COUNT(*) > 50;

--3. What are the customer numbers corresponding to the store_id values in the customer table?
--SELECT store_id, COUNT(customer)
--FROM customer
--GROUP BY store_id

--4. After grouping the city data in the city table according to the country_id column, share the country_id information with the highest number of cities and the number of cities.
SELECT country_id, COUNT(city)
FROM city
GROUP BY country_id
ORDER BY COUNT(city) DESC
LIMIT 1