CREATE TABLE authors
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(500) NOT NULL,
    email    VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL
);
