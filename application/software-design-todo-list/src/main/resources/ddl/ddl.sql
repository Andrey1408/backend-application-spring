CREATE TABLE task_list
(
    id          bigint       NOT NULL PRIMARY KEY,
    name        varchar(300) NOT NULL,
    description varchar(3000)
);

CREATE SEQUENCE task_list_seq
    MINVALUE 0;

ALTER TABLE task_list
    OWNER TO postgres;

ALTER SEQUENCE task_list_seq OWNER TO postgres;

CREATE TABLE task
(
    id           bigint PRIMARY KEY,
    task_list_id bigint REFERENCES task_list (id) NOT NULL,
    status       char(1)                          NOT NULL,
    name         varchar(300)                     NOT NULL,
    description  varchar(3000)
);

CREATE SEQUENCE task_seq
    MINVALUE 0;

ALTER TABLE task
    OWNER TO postgres;

ALTER SEQUENCE task_seq OWNER TO postgres;


CREATE TABLE died_state
(
    id     bigint  NOT NULL PRIMARY KEY,
    status char(1) NOT NULL
);

INSERT INTO died_state(id, status) values (0, 'A');

CREATE SEQUENCE died_state_seq
    MINVALUE 1;

ALTER TABLE died_state
    OWNER TO postgres;

ALTER SEQUENCE died_state_seq OWNER TO postgres;

