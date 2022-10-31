CREATE TABLE dessert
(
    id       BIGINT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name     text    NOT NULL,
    price    text    NOT NULL,
    cuisines text
);
create table drink
(
    id    BIGINT    NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name  text    NOT NULL,
    price text    NOT NULL
);
CREATE TABLE main_course
(
    id       BIGINT    NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name     text    NOT NULL,
    price    text    NOT NULL,
    cuisines text
);

