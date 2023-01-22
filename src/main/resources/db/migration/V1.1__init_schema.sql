CREATE TABLE music(
    id bigint NOT NULL,
    album_id bigint NOT NULL,
    title varchar(255),
    url varchar(255),
    thumbnail_url varchar(255),
    PRIMARY KEY (ID)
);