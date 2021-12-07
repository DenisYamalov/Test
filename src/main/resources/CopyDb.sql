

COPY test.departments(id, name)
FROM 'D:\java\GitHub\Test\department.csv'
DELIMITER ';'
CSV HEADER;

copy test.employees (id, department_id,chief_id,name,salary)
FROM 'D:\java\GitHub\Test\employees.csv'
DELIMITER ';'
CSV HEADER;


SELECT DISTINCT a.name FROM employee a, employee b WHERE a.id = b.chief_id AND a.salary > (SELECT MAX(a.salary) FROM employee b RIGHT JOIN employee a ON (b.chief_id = a.id) WHERE b.name IS NULL);

SELECT DISTINCT a.name FROM test.employees a, test.employees b WHERE a.id = b.chief_id AND a.salary > (SELECT MAX(a.salary) FROM test.employees b RIGHT JOIN test.employees a ON (b.chief_id = a.id) WHERE b.name IS NULL);


SELECT a.* FROM employee a, employee b WHERE b.id = a.chief_id AND a.department_id != b.department_id;

SELECT a.* FROM test.employees a, test.employees b WHERE b.id = a.chief_id AND a.department_id != b.department_id;