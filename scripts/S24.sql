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