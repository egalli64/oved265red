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

--POPOLAMENTO TABELLA superusers
DROP SEQUENCE superusers_id_seq;
CREATE SEQUENCE superusers_id_seq START WITH 1000 INCREMENT BY 1;
INSERT INTO superusers VALUES (superusers_id_seq.NEXTVAL, 'Emanuele', 'Baldi', '01-NOV-1993', 'emanuelebaldi@gmail.com', 'EmanueleBaldi-93');
INSERT INTO superusers VALUES (superusers_id_seq.NEXTVAL, 'Michele', 'Andreoli', '12-MAG-1992', 'micheleandreoli@gmail.com', 'MicheleAndreoli-92');
INSERT INTO superusers VALUES (superusers_id_seq.NEXTVAL, 'Antonio', 'Pontrelli', '13-SET-1990', 'antoniopontrelli@gmail.com', 'AntonioPontrelli-90');

--POPOLAMENTO TABELLA users
DROP SEQUENCE users_id_seq;
CREATE SEQUENCE users_id_seq START WITH 20000 INCREMENT BY 1;
INSERT INTO users VALUES (users_id_seq.NEXTVAL, 'Mario', 'Rossi', '01-GEN-2000', 'mariorossi@gmail.com', 'MarioRossi-00', '5191231234567890', 'MI1234567A');

commit;