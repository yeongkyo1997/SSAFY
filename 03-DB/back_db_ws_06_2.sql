use ssafy_movie;

# 1
select count(*) as '영화 수'
from movie;

# 2
select avg(runningtime) as '평균'
from movie;

# 3
select sum(runningtime) as '총 합'
from movie;

# 4
select round(avg(runningtime), 2) as '포터평균'
from movie
where title like '%포터%';

# 5
select cinemacode, count(cinemacode) as 수
from movie
group by cinemacode;

# 6
select cinemacode, min(releasedate) as '날짜'
from movie
group by cinemacode;

# 7
select cinemacode, max(runningtime) as '최대'
from movie
group by cinemacode;

# 8
select cinemacode, avg(runningtime) as '평균'
from movie
group by cinemacode
having `평균` >= 150;

# 9
select cinemacode, sum(runningtime) as '합'
from movie
group by cinemacode
having `합` >= 300;

# 10
select cinemacode, avg(runningtime) as 평균, sum(runningtime) as 합
from movie
group by cinemacode
having `평균` >= 150 and
`합` >= 300;