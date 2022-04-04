CREATE TABLE events (
    id bigserial NOT NULL,
    title varchar(255) not null,
    artists_id integer DEFAULT NULL,
    description varchar(255) NOT NULL,
    occupied_places integer NOT NULL,
    age_limit integer NOT NULL,
    date date NOT NULL,
    PRIMARY KEY (id),
    foreign key (artists_id) references artists(id)
);