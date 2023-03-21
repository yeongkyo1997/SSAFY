# 1

# 2
select customerNumber
from orders
where orderNumber = 10100;

# 3
select *
from orders
where customerNumber between 100 and 150;

# 4
select distinct status
from orders;

# 5
select *
from orderdetails
order by priceEach desc
limit 5;

# 6
select *
from employees
where lastName like '%B%';

# 7
select concat(lastName, " ", firstName) as 이름, employeeNumber, jobTitle
from employees
where employeeNumber <= 1500 and
officeCode = 4;

# 8
select reverse(checkNumber)
from payments
order by paymentDate desc
limit 1;

# 9
select postalCode as 우편번호, concat(addressLine1, ' ', addressLine2) as 주소, phone as 전화번호
from offices
where city = 'Boston';

# 10
select *
from products
where productline = 'Motorcycles' 
order by quantityInStock desc;