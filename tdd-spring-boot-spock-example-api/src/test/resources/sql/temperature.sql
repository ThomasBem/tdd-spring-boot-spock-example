CREATE SCHEMA tdd;

DROP TABLE IF EXISTS tdd.temperature;

CREATE TABLE tdd.temperature(
  city VARCHAR,
  temperature INTEGER,
  timestamp VARCHAR
);

INSERT INTO tdd.temperature (city, temperature, timestamp) VALUES ('Oslo', 25, '123456781');
INSERT INTO tdd.temperature (city, temperature, timestamp) VALUES ('Oslo', 20, '123456782');
INSERT INTO tdd.temperature (city, temperature, timestamp) VALUES ('Oslo', 15, '123456783');
INSERT INTO tdd.temperature (city, temperature, timestamp) VALUES ('Oslo', 10, '123456784');
INSERT INTO tdd.temperature (city, temperature, timestamp) VALUES ('Oslo', 5, '123456785');
INSERT INTO tdd.temperature (city, temperature, timestamp) VALUES ('Oslo', 35, '123456786');
