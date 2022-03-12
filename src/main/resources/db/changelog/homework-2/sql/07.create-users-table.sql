CREATE TABLE users (
    id bigserial unique,
    phone_number varchar(15) null,
    firstname varchar null,
    surname varchar null,
    PRIMARY KEY (id)
);