/*
Customers Who Never Order

 Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.

Table: Customers.

+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+

Table: Orders.

+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+

Using the above tables as example, return the following:

+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+

*/

/* Solution 1 */
SELECT c.Name AS Customers FROM Customers c WHERE c.Id NOT IN (SELECT c.CustomerId FROM Orders)

/* Solution 2*/
SELECT c.Name AS Customers FROM Customers c LEFT JOIN Orders o ON o.CustomerId = c.Id WHERE CustomerId IS NULL
