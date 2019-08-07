--Nome degli employees e del loro department

select e.first_name as Name, d.department_name as Department
from employees e join departments d
on (e.department_id = d.department_id);

--Nome degli employees e job title (da JOBS)

select e.first_name as Name, j.job_title as JobTitle
from employees e join jobs j
on (e.job_id = j.job_id);

--Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title

select e.first_name as Name 
from employees e join jobs j
on ((e.salary=j.min_salary)and (e.job_id=j.job_id) ) or ((e.salary=j.max_salary)and(e.job_id=j.job_id) ) ;

--Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title

select e.first_name as Name 
from employees e natural join jobs j
where e.salary in (j.min_salary,j.max_salary);

--Nome degli employees basati in UK (LOCATIONS)

select e.first_name as Name
from employees e join departments d on (e.department_id=d.department_id)
join locations l on d.location_id=l.location_id and l.country_id='UK';

--Nome dei departments e manager associato(NO)

select department_name as Department, last_name as manager
from employees  RIGHT OUTER JOIN departments 
using(department_id);

--Nome di ogni department e, se esiste, del relativo manager

select department_name as Department, last_name as manager
from employees  JOIN departments 
using(department_id);

--Nome dei department che non hanno un manager associato

select department_name as Department 
from departments  
where manager_id is null;

--Nome degli employees e del loro manager

select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id);

--Nome degli employees che non sono manager

select e.last_name as employee
from employees e left OUTER join employees m on(e.manager_id=m.employee_id)
WHERE m.manager_id not in e.employee_id;

instr('crab abba rabid cab', 'ab', 2, 3) as pos 
from dual;

select lpad('tom', 30, '.') tom, rpad('tim', 30, '_- -_') tim from dual;

select replace('Begin here', 'Begin', 'End'), substr('ABCDEFG',3,4) from dual; --tieni dalla posizione 3 solo 4 valori
 
select replace('Begin here', 'Begin', 'End'), substr('13-GEN-2018',3,4) from dual;

select replace('Begin here', 'Begin', 'End'), substr(12548769654,3,4) from dual;

select trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;

select abs(10), abs(-10), ceil(5.8), ceil(-5.2), floor(5.8), floor(-5.2), mod(8, 3), mod(8, 4),
power(2, 1), power(2, 3), exp(1), sqrt(25), sqrt(5), log(10, 100), ln(exp(1)),
round(5.75), round(5.75, 1), round(5.75, -1), trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;

select to_char(12345.67), to_char(12345.67, '99,999.99'),
to_char(2019, 'RN'), to_number('970,13') * 2,
cast('05-APR-19' as date) + 2, cast(12345.678 as number(10,2))
from dual;

select add_months(sysdate, 3), months_between(sysdate, '01-FEB-2019'),
last_day(sysdate), next_day(sysdate, 'lun'),
round(sysdate, 'year'), round(sysdate, 'month'),
trunc(sysdate, 'year'), trunc(sysdate, 'month')
from dual;

--Qual è il salario corrente, quale sarebbe con un incremento dell’8.5%, qual è il delta come valore assoluto

select salary, salary+salary*0.085, salary*0.085 
from employees ;

--Chi ha ‘a’ nel nome o cognome

select last_name, first_name
from employees
where regexp_like(last_name, '*[aA].*') or regexp_like(first_name, '*[aA].*') ;

--Quanti mesi sono passati dall’assunzione a oggi

select trunc(months_between('06-AGO-2019',hire_date ))
from employees;

--Salario mostrato come una serie di asterischi (1 = 1000€)

select LPAD('*',salary/1000,'*')
from employees;

--Quant’è la commissione di ognuno o ‘no value’

select employee_id, nvl2(commission_pct, (to_char(commission_pct)), 'no value')
from employees;

--max stipendio per ogni dipartimento 

select department_id, trunc(max(salary))
from employees
group by department_id
order by 1;

select region_name, country_count
from regions natural join (
    select region_id, count(rowid) country_count --ottengo l id delle regioni a cui associo qnt country sono associate e sono raggruppate per region_id
    from countries
    group by region_id);
    
select first_name, last_name from employees
where employee_id not in(
select distinct manager_id
from employees where manager_id is not null)
order by 2;    

--Salary: maggiore, minore, somma, media

select MAX(salary) as Max, min(salary) as Min, sum(salary) as Sum, round(avg(salary),2) as Average
from employees;

--Salary: maggiore, minore, somma, media ma per ogni job_id

select MAX(salary) as Max, min(salary) as Min, sum(salary) as Sum, round(avg(salary),2) as Average
from employees
group by job_id;

--Quanti dipendenti per ogni job_id

select count(employee_id)
from employees
group by job_id;

--Quanti sono gli IT_PROG

select count(employee_id)
from employees
where job_id='IT_PROG'
group by job_id;

--Quanti sono i manager (NO)

select count (distinct manager_id)
from employees;


--Qual è la differenza tra il salario maggiore e il minore

select MAX(salary) - min(salary) 
from employees;

--Come sopra, ma per ogni job_id, non considerando dove non c’è differenza

select MAX(salary) - min(salary) 
from employees
group by job_id
HAVING (MAX(salary) - min(salary)) > 0

--Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€

select min(salary) 
from employees
where employee_id in(
select distinct manager_id
from employees 
where manager_id is not null and salary>6000)
group by manager_id;


--Indirizzi completi, tra locations e countries
select c.country_name as Country, l.street_address as Address, l.city as City
from countries c join locations l
on (c.country_id=l.country_id);

--Name e department name
select e.last_name as LastName, e.first_name as Name, d.department_name as Department
from employees e join departments d
on (e.department_id=d.department_id);

--Name e department name, ma solo per chi è basato a Toronto

select e.last_name as Surname , d.department_name as Department
from employees e join departments d on (e.department_id=d.department_id)
join locations l on d.location_id=l.location_id and l.location_id=1800;

--Chi è stato assunto dopo David Lee

select last_name as Surname 
from employees 
where  hire_date>(select hire_date from employees where last_name='Lee' and first_name='David');

--Chi è stato assunto prima del proprio manager(NO)
select last_name as Surname 
from employees 
where  hire_date < (select hire_date from employees where manager_id!=employee_id);

--Chi ha lo stesso manager di Lisa Ozer
select last_name as Surname 
from employees 
where manager_id= (select manager_id from employees where last_name='Ozer' and first_name='Lisa');

--Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome

(select last_name
from employees
where regexp_like(last_name, '*[uU].*') or regexp_like(first_name, '*[uU].*') );

insert into regions(region_id) values (12);

insert into regions values (13, null);

update regions
set region_name = 'Region ' || region_id
where region_id > 10;

delete from regions
where region_id > 10;

insert into regions values (13, 'Terra');
delete from regions
where region_id > 10;
