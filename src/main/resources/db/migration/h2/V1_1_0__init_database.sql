CREATE TABLE IF NOT EXISTS CLIENT_ORGANISATION
(
    ID                bigint generated by default as identity,
    NAME              varchar(255),
    REGISTRATION_DATE DATETIME(6),
    EXPIRY_DATE       DATETIME(6),
    ENABLED           boolean,
    primary key (ID)
);


create table if not exists personnel
(
    id                     bigint generated by default as identity,
    email                  varchar(255),
    first_name             varchar(255),
    last_name              varchar(255),
    password               varchar(255),
    phone_number           varchar(255),
    user_name              varchar(255),
    client_organisation_id bigint,
    primary key (id),
    foreign key (client_organisation_id) references client_organisation (ID)
);