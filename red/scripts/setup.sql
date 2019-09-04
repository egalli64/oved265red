--CREAZIONE TABELLA members--
DROP TABLE users;
CREATE TABLE users (
users_id INTEGER
CONSTRAINT users_id_pk PRIMARY KEY,
users_name VARCHAR2(20)
CONSTRAINT user_name_nn NOT NULL,
users_surname VARCHAR2(20)
CONSTRAINT users_surname_nn NOT NULL,
users_birth DATE
CONSTRAINT users_birth_nn NOT NULL,
users_username VARCHAR2(50)
CONSTRAINT users_username NOT NULL,
CONSTRAINT users_username_uq UNIQUE(users_username),
users_password VARCHAR2(50)
CONSTRAINT users_password NOT NULL,
users_creditcard INTEGER
CONSTRAINT users_creditcard NOT NULL,
users_licence VARCHAR2(10)
CONSTRAINT users_licence NOT NULL,
CONSTRAINT users_licence_uq UNIQUE(users_licence));

--CREAZIONE TABELLA superusers--
DROP TABLE superusers;
CREATE TABLE superusers (
superusers_id INTEGER
CONSTRAINT superusers_id_pk PRIMARY KEY,
superusers_name VARCHAR2(20)
CONSTRAINT superusers_name_nn NOT NULL,
superusers_surname VARCHAR2(20)
CONSTRAINT superusers_surname_nn NOT NULL,
superusers_birth DATE
CONSTRAINT superusers_birth_nn NOT NULL,
superusers_username VARCHAR2(50)
CONSTRAINT superusers_username NOT NULL,
CONSTRAINT superusers_username_uq UNIQUE(superusers_username),
superusers_password VARCHAR2(50)
CONSTRAINT superusers_password NOT NULL);