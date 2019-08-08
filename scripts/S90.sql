--Scrivere e invocare la procedura tomorrow() che stampa la data di domani

set serveroutput on

create or replace procedure tomorrow is
begin
    dbms_output.put_line('Tomorrow is ' || (sysdate+1));
end tomorrow;
/

begin
tomorrow();
end;
/

--Modificare tomorrow() per fargli accettare come parametro un nome da stampare
set serveroutput on

create or replace procedure tomorrow is
begin
    dbms_output.put_line('');
end tomorrow;
/

declare 
p_name VARCHAR2(20):= 'Federica';
begin
tomorrow();
dbms_output.put_line(p_name);
end;
/

--Scrivere e invocare la procedura get_coder() che ritorna nome e cognome di un coder identificato via id

create or replace procedure get_coder (
p_coder_id in coders.coder_id%type,
p_first_name out coders.first_name%type,
p_last_name out coders.last_name%type
)is begin
select first_name, last_name
into p_first_name,p_last_name
from coders
where coder_id=p_coder_id;
dbms_output.put_line( '');
end get_coder;
/

declare
v_coder_id coders.coder_id%type:= 105;
v_first_name coders.first_name%type;
v_last_name coders.last_name%type;
begin
get_coder (v_coder_id, v_first_name, v_last_name);
dbms_output.put_line( v_first_name ||' ' || v_last_name);
end;
/
