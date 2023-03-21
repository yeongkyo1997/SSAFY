use sakila;

# 1
select datediff("2023-12-25", curdate()) as "크리스마스까지 남은 날짜"
from dual;

# 2
select avg(rental_rate) as "평균 대여 비율", sum(length) as "상영시간 총합"
from film;

# 3
select count(*)
from rental
where date_format(return_date, "%Y-%m-%d") = "2005-06-01";

# 4
select film_id, title, description, length
from film
where length between 60 and 120 and
description like '%robot%'
order by length
limit 11, 3;

# 5
select rating as '등급', count(film_id) as '영화수', avg(rental_duration) as '평균', max(length) as '최장 길이', min(length) as '최단 길이'
from film
group by rating;

# 6
select customer_id, count(customer_id)
from rental
group by customer_id
order by 2 desc
limit 10;

# 7
select avg(replacement_cost), avg(rental_rate)
from film
group by retnal_duration;

# 8
select sum(replacement_cost)
from film
where rental_duration >= 5;

# 9
select rating, avg(rental_duration), sum(replacement_cost), avg(length)
from film
where title like 'C%'
group by rating;