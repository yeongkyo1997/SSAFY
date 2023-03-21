# 1
use sakila;

# 2
select film_id, title
from film
where rental_duration >= 7;

# 3
select film_id, title, rental_rate, length
from film
where rental_rate >= 4
order by length;

# 4
select distinct rating
from film;

# 5
select *
from rental
where inventory_id = 367;

# 6
select *
from rental
limit 5;

# 7
select inventory_id
from rental
where rental_date <= '2005-05-24-23';

# 8
select last_update
from actor
order by last_update desc
limit 1;

# 9
select *
from actor
where first_name like 'Z%';

# 10
select *
from actor
where actor_id <= 10 and 
last_name like '%C%';

# 11
select *
from actor
where length(first_name) = 5 and length(last_name) = 5
limit 3;

# 12
select reverse(first_name)
from actor
where actor_id = 25;

# 13
select concat('제가 제일 좋아하는 배우는 ', first_name, last_name, ' 입니다') as concat
from actor
limit 1;