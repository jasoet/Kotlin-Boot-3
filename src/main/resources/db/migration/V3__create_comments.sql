CREATE TABLE comments
(
    name         VARCHAR(255) NOT NULL,
    content      TEXT         NOT NULL,
    post_id      INT          NOT NULL,
    published_at TIMESTAMP    NOT NULL,
    updated_at   TIMESTAMP    NOT NULL,
    FOREIGN KEY (post_id) REFERENCES posts (id)
);
