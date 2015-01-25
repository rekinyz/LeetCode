/*
Department Highest Salary

 The Employee table holds all employees. Every employee has an Id, a salary, and there is also a column for the department Id.

+----+-------+--------+--------------+
| Id | Name  | Salary | DepartmentId |
+----+-------+--------+--------------+
| 1  | Joe   | 70000  | 1            |
| 2  | Henry | 80000  | 2            |
| 3  | Sam   | 60000  | 2            |
| 4  | Max   | 90000  | 1            |
+----+-------+--------+--------------+

The Department table holds all departments of the company.

+----+----------+
| Id | Name     |
+----+----------+
| 1  | IT       |
| 2  | Sales    |
+----+----------+

Write a SQL query to find employees who have the highest salary in each of the departments. For the above tables, Max has the highest salary in the IT department and Henry has the highest salary in the Sales department.

+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT         | Max      | 90000  |
| Sales      | Henry    | 80000  |
+------------+----------+--------+

*/
CREATE TABLE Employee(id INT, Name CHAR(30), Salary INT, DepartmentId INT);
INSERT INTO Employee (id, Name, Salary, DepartmentId) VALUES
(1, 'Joe',70000, 1),
(2, 'Henry',80000,2),
(3, 'Sam',60000, 2),
(4, 'Timo',70000, 1),
(5, 'Peter',80000, 2),
(6, 'Max',50000, 1);

CREATE TABLE Department(id INT, Name CHAR(30));
INSERT INTO Department (id, Name) VALUES
(1, 'IT'),
(2, 'Sales');



/* Solution 1*/
SELECT r.Name AS Department, e.Name AS Employee, e.Salary
FROM Employee e JOIN
(SELECT d.Id, d.Name, Max(e.Salary) AS maxSalary
FROM Employee e JOIN Department d ON e.DepartmentId = d.Id 
GROUP BY Id) r ON r.Id = e.DepartmentId AND r.maxSalary = e.Salary

/* Solution 2*/
SELECT d.Name AS Department, e.Name AS Employee, e.Salary
FROM Employee e JOIN Department d ON e.DepartmentId = d.Id AND (DepartmentId, Salary) IN 
(SELECT DepartmentId, MAX(Salary) FROM Employee GROUP BY DepartmentId)

/* Solution 3*/
SELECT d.Name AS Department, e.Name AS Employee, e.Salary 
FROM Employee e, Department d, (SELECT DepartmentId, MAX(Salary) AS maxSalary FROM Employee GROUP BY DepartmentId) r
WHERE e.DepartmentId = r.DepartmentId AND e.Salary = r.maxSalary AND e.DepartmentId = d.id

/*Solution 4: inspired by the Department Top Three Salaries*/
SELECT d.Name AS Department, e.Name AS Employee, e.Salary AS Salary 
FROM Employee e JOIN Department d ON e.DepartmentId = d.Id AND
 (SELECT COUNT(DISTINCT Salary) FROM Employee WHERE DepartmentId = e.DepartmentId AND Salary > e.Salary) < 1
ORDER BY e.DepartmentId, e.Salary DESC;