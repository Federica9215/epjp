select first_name,last_name, email, phone_number, hire_date 
from employees
order by last_name, first_name;

select * 
from employees
where first_name ='David' or first_name='Peter';

select * 
from employees
where department_id=60;

select * 
from employees
where department_id=60;

select * 
from employees
where department_id=30 or department_id=50;

select * 
from employees
where salary>10000;

select * 
from employees
where salary<4000 or salary>15000 ;

select * 
from employees
where (salary<4000 or salary>15000) and (department_id=50 or department_id=80) ;

select * 
from employees
where hire_date between '01-GEN-2005' and '31-DIC-2005';

select distinct job_id 
from employees;

select * 
from employees
where commission_pct!=0;

select * 
from employees
where last_name like '%a%' or first_name like '%a%';

select department_name
from departments
order by department_name;

select street_address
from locations
where country_id='IT';

select * 
from employees
where manager_id=108;

select * 
from employees
where last_name like '%a%' and first_name like '%a%';

select region_name, country_name
from regions join countries -- join è “inner” per default
using(region_id);

select region_name, country_name
from regions, countries;

select region_name, country_name
from regions cross join countries;

select first_name, department_name
from employees left outer join departments
using(department_id)
where last_name = 'Grant';

select first_name, department_name
from employees join departments
using(department_id)
where last_name = 'Grant';

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;

select e.last_name, d.department_name
from employees e full outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120;