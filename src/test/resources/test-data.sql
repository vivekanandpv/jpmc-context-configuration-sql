DROP TABLE IF EXISTS dummy;

CREATE TABLE dummy (
                       id INT PRIMARY KEY,
                       "value" VARCHAR(50)
);

INSERT INTO dummy (id, "value") VALUES (1, 'sample');
