--ClientOrganisation
INSERT INTO CLIENT_ORGANISATION (NAME, REGISTRATION_DATE, EXPIRY_DATE, ENABLED)
VALUES ('GOOOGLE', '2022-04-04', '2022-12-24', TRUE),
       ('NHS', '2021-04-04', '2022-09-24', TRUE),
       ('TFL', '2020-04-04', '2022-07-10', TRUE);


--Personel
INSERT INTO PERSONNEL (email, first_name, last_name, password, phone_number, user_name, client_organisation_id)
VALUES ('marcin@google.com', 'Marcin', 'Ziel', 'ofSBT4LxGvm+tdZMr02lng==', '07523687162', 'marcin123', 2),
       ('sfg@google.com', 'John', 'Smith', 'ofSBT4LxGvm+tdZMr02lng==', '07523687162', 'marcin123', 2),
       ('ncfgn@google.com', 'Eva', 'Mendez', 'ofSBT4LxGvm+tdZMr02lng==', '075256457457', 'Eva22', 1),
       ('ncfgn@google.com', 'Mat', 'Kasay', 'ofSBT4LxGvm+tdZMr02lng==', '0752345646', 'MAT34', 3);