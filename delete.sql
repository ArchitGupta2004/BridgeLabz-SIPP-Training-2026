DELETE FROM covid_cases
WHERE country = 'IN';

-- Remove duplicates (example logic)
DELETE FROM covid_cases
WHERE country = 'India'
AND date = '2023-01-01'
LIMIT 1;