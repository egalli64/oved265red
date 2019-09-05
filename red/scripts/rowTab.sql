--POPOLAMENTO TABELLA superusers
--DROP SEQUENCE superusers_id_seq;
CREATE SEQUENCE superusers_id_seq START WITH 1000 INCREMENT BY 1;
INSERT INTO superusers VALUES (superusers_id_seq.NEXTVAL, 'Emanuele', 'Baldi', '01-NOV-1993', 'emanuelebaldi@gmail.com', 'EmanueleBaldi-93');
INSERT INTO superusers VALUES (superusers_id_seq.NEXTVAL, 'Michele', 'Andreoli', '12-MAG-1992', 'micheleandreoli@gmail.com', 'MicheleAndreoli-92');
INSERT INTO superusers VALUES (superusers_id_seq.NEXTVAL, 'Antonio', 'Pontrelli', '13-SET-1990', 'antoniopontrelli@gmail.com', 'AntonioPontrelli-90');

--POPOLAMENTO TABELLA users
--DROP SEQUENCE users_id_seq;
CREATE SEQUENCE users_id_seq START WITH 20000 INCREMENT BY 1;
INSERT INTO users VALUES (users_id_seq.NEXTVAL, 'Mario', 'Rossi', '01-GEN-2000', 'mariorossi@gmail.com', 'MarioRossi-00', '5191231234567890', 'MI1234567A');