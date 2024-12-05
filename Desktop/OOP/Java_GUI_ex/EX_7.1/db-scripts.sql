DROP DATABASE IF EXISTS currency_app;

CREATE DATABASE currency_app;

USE currency_app;

CREATE TABLE currency (
    id INT AUTO_INCREMENT PRIMARY KEY,
    abbreviation VARCHAR(10) NOT NULL,
    name VARCHAR(100) NOT NULL,
    rate DECIMAL(10, 4) NOT NULL
);

INSERT INTO currency (abbreviation, name, rate) 
VALUES 
    ('USD', 'US Dollar', 1.0000),
    ('EUR', 'Euro', 0.8832),
    ('GBP', 'British Pound', 0.7532),
    ('JPY', 'Japanese Yen', 113.8700),
    ('AUD', 'Australian Dollar', 1.3802),
    ('CAD', 'Canadian Dollar', 1.2830),
    ('CHF', 'Swiss Franc', 0.9217),
    ('CNY', 'Chinese Yuan', 6.3778);

DROP USER IF EXISTS 'appuser'@'localhost';

CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'passwordBLAH123';

GRANT SELECT ON currency_app.currency TO 'appuser'@'localhost';

FLUSH PRIVILEGES;
