CREATE TABLE posts
(
    id           SERIAL       NOT NULL PRIMARY KEY,
    title        VARCHAR(255) NOT NULL,
    content      TEXT         NOT NULL,
    version      INT          NOT NULL DEFAULT 0,
    author       INT          NOT NULL,
    published_at TIMESTAMP    NOT NULL,
    updated_at   TIMESTAMP    NOT NULL,
    FOREIGN KEY (author) REFERENCES authors (id)
);
