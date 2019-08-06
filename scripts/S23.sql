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

select e.last_name as employee, m.last_name as manager
from employees e left OUTER join employees m on(e.manager_id=m.employee_id)
WHERE m.manager_id not in e.employee_id;
 

