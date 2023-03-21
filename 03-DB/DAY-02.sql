-- 절대값
select abs(-5), abs(5), abs(+5)
from dual;

-- 올림, 내림
select ceil(12.912), ceiling(12,912), ceil(-12.912), ceiling(-12.912)
from dual;

select floor(12.912), floor(-12.912)
from dual;

-- 반올림
select round(1823.9123), round(1823.9123, 0), round(1823.9123, 1), round(1823.9123, -2)
from dual;

select truncate(1823.9123), truncate(1823.9123, 0), truncate(1823.9123, 1), truncate(1823.9123, -2)
from dual;

-- 제곱승, 나머지, 최대, 최솟값
select pow(2, 3), power(2, 3)
from dual;

select mod(10, 4), 10 % 4
from dual;

select greatest(1, 4, 8, 2, 6), least(1, 4, 8, 2, 6)
from dual;

select now(), sleep(5), now()
from dual;

select sysdate(), sleep(5), sysdate()
from dual;

select current_timestamp(), sleep(5), current_timestamp()
from dual;

use ssafydb;
select count(employee_id), count(department_id), count(*)
from employees;