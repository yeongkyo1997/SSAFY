use world;

# 1
select curdate() as '오늘', timestampdiff(day, '2023-01-01', curdate()) as '올해 지난 날', date_add(curdate(), INTERVAL 100 day) as '100일 후'
from dual;

# 2
select name, continent, lifeexpectancy, case
when LifeExpectancy > 80 then '장수국가'
when LifeExpectancy > 60 then '일반국가'
else '단명국가'
end '구분'
from country
where continent = 'asia';

# 3
select name, gnp, gnpold, ifnull(gnp-gnpold, '신규')
from country
order by name;

# 5
select count(*) as 전체, count(indepyear) as '독립 연도 보유'
from country;

# 6
select sum(LifeExpectancy) as 합계, round(avg(LifeExpectancy), 2) as 평균, max(LifeExpectancy) as 최대, min(LifeExpectancy) as 최소
from country;

# 7
select continent, count(continent) as '국가 수', sum(population)
from country
group by continent
order by 2 desc;

# 8
select continent, sum(surfacearea)
from country
group by continent
order by 2 desc
limit 3;

# 9
select continent, sum(gnp) as 'gnp 합'
from country
where population >= 50000000
group by 1
order by 2;

# 10
select continent, sum(gnp) as 'gnp 합'
from country
where population >= 50000000
group by 1
having `gnp 합` >= 5000000;

# 11
select indepyear, count(indepyear) as '독립 국가 수'
from country
group by 1
having `독립 국가 수` >= 10;

# 12
select any_value(continent), name, any_value(gnp), avg(gnp in (
select gnp from country
)), any_value(select avg(gnp) from country group by continent)
from country a
group by name;