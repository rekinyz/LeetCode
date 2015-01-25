/* 
Department Top Three Salaries

 The Employee table holds all employees. Every employee has an Id, and there is also a column for the department Id.

+----+-------+--------+--------------+
| Id | Name  | Salary | DepartmentId |
+----+-------+--------+--------------+
| 1  | Joe   | 70000  | 1            |
| 2  | Henry | 80000  | 2            |
| 3  | Sam   | 60000  | 2            |
| 4  | Max   | 90000  | 1            |
| 5  | Janet | 69000  | 1            |
| 6  | Randy | 85000  | 1            |
+----+-------+--------+--------------+

The Department table holds all departments of the company.

+----+----------+
| Id | Name     |
+----+----------+
| 1  | IT       |
| 2  | Sales    |
+----+----------+

Write a SQL query to find employees who earn the top three salaries in each of the department. For the above tables, your SQL query should return the following rows.

+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT         | Max      | 90000  |
| IT         | Randy    | 85000  |
| IT         | Joe      | 70000  |
| Sales      | Henry    | 80000  |
| Sales      | Sam      | 60000  |
+------------+----------+--------+
*/

/* http://www.sqlfiddle.com/#!2/e87e7/15 */
CREATE TABLE Employee(id INT, Name CHAR(30), Salary INT, DepartmentId INT);
INSERT INTO Employee (id, Name, Salary, DepartmentId) VALUES
(1, 'Joe',70000, 1),
(2, 'Henry',80000,2),
(3, 'Sam',60000, 2),
(4, 'Max',90000, 1),
(5, 'Janet',69000, 1),
(6, 'Randy',85000, 1);

CREATE TABLE Department(id INT, Name CHAR(30));
INSERT INTO Department (id, Name) VALUES
(1, 'IT'),
(2, 'Sales');

/*Solution*/
SELECT d.Name AS Department, e.Name AS Employee, e.Salary AS Salary 
FROM Employee e JOIN Department d ON e.DepartmentId = d.Id AND
 (SELECT COUNT(DISTINCT Salary) FROM Employee WHERE DepartmentId = e.DepartmentId AND Salary > e.Salary) < 3
ORDER BY e.DepartmentId, e.Salary DESC;

