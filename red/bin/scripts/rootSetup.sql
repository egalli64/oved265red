-- c:> sqlplus / as sysdba
-- sql> @rootSetup.sql

create user red identified by red account unlock;
grant connect, resource to red;
alter user red quota unlimited on users;

--exit