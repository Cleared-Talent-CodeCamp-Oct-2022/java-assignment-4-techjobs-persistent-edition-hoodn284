-- Part 1: Test it with SQL
id INTEGER
name VARCHAR
employer VARCHAR
skills VARCHAR
-- Part 2: Test it with SQL
Select name FROM employer WHERE location = "St. Louis City"

-- Part 3: Test it with SQL
DROP TABLE job
-- Part 4: Test it with SQL
SELECT * FROM skill LEFT JOIN job ON skill.id = job.id ORDER BY skill.name ASC


