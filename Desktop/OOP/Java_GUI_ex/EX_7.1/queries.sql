git SELECT * FROM currency;

SELECT * FROM currency WHERE abbreviation = 'EUR';

SELECT COUNT(*) AS number_of_currencies FROM currency;

SELECT * FROM currency ORDER BY rate DESC LIMIT 1;
