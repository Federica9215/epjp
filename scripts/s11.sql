-- la tabella dual
select sysdate
from dual;

-- tutta la tabella
select *
from regions;

-- colonne
select region_name
from regions;

-- righe
select *
from regions
where region_id = 1;

select rowid, rownum
from regions;

-- ciao 
select * 
from regions;

select region_id, region_name
from regions;

select region_name 
from regions;

select * 
from regions 
where region_id = 1;

select region_name 
from regions 
where region_id = 1;

select rowid, rownum 
from regions;

select country_name
from countries
where country_id='IT';

select *
from user_tables;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';

select 1+2, 3-4, 2*6, 5/2
from dual;

select to_date('30-OTT-2019') + 2, to_date('02-OTT-2019') - 3 from dual;

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

select to_date('02-NOV-2019') - to_date('25-MAR-2019') from dual; --differenza tra due date


select sysdate from dual;

select job_title, min_salary as original, min_salary salary
from jobs;

select job_title, min_salary + 2000 "increased min salary"
from jobs;

select job_title, min_salary + 2000 as "increased min salary"
from jobs;

select first_name || ' ' || last_name as "Employee's name"
from employees;

select email || ': ' || salary as "Salary"
from employees;

select last_name || ' ' || email || ': ' || salary as "Salary"
from employees;

select first_name, last_name, 12 * salary * commission_pct --in qst caso ritorna cmq null lì dove abbiamo dei null in entrata 
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) --in questo caso ritorna 0 lì dove vede dei null
from employees;

select first_name, last_name, (12 * salary) * + nvl(commission_pct, 1)
from employees;

select distinct manager_id
from employees;

select distinct job_id
from employees;


