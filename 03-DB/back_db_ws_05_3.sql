# 1
use world;

# 2

# 3
select code, name, continent, region
from country
where code = 'KOR';

# 4
select code, name, gnp, gnpold, (gnp - gnpold) as gnp변동량
from country
where (gnp - gnpold) > 0
order by 5;

# 5
select distinct continent
from country
order by length(continent);

# 6
select concat(name, '은 ', region, '에 속하며 인구는 ', population, '명이다.') as 정보
from country
where continent = 'Asia'
order by name;

# 7
select name, continent, gnp, population
from country
where IndepYear is null and 
population >= 10000
order by population;

# 8
select code, name, population
from country 
where population between 100000000 and 200000000
order by population desc
limit 3;

# 9
select code, name, indepyear
from country
where indepyear in (800, 1810, 1811, 1901)
order by indepyear, code desc;

# 10
select code, name, region
from country
where region like '%asia%' and
name like '_o%';

# 11
select char_length('홍길동') as 한글, length('hong') as 영문;

# 12
select code, name, governmentform
from country
where length(name) >= 10 and governmentform like '%republic%'
order by length(name) desc
limit 10;

# 13
select code, name
from country
where substring(code, 1, 1) in ('a,', 'e', 'o', 'u', 'i')
order by name
limit 3, 3;

# 14
select name, concat(substring(name, 1, 2), repeat('*', length(name) - 4), substring(name, -2, 2)) as guess
from country;

# 15
select distinct replace(region, ' ', '_') as 지역들
from country
order by length(region);

# 16
select name, surfacearea, population, round(surfacearea/population, 3) as '1인당 점유면적'
from country
where population >= 100000000;