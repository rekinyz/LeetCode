/*
Consecutive Numbers

Write a SQL query to find all numbers that appear at least three times consecutively.

+----+-----+
| Id | Num |
+----+-----+
| 1  |  1  |
| 2  |  1  |
| 3  |  1  |
| 4  |  2  |
| 5  |  1  |
| 6  |  2  |
| 7  |  2  |
+----+-----+

For example, given the above Logs table, 1 is the only number that appears consecutively for at least three times.
*/

CREATE TABLE Logs(id INT, Num INT);
INSERT INTO Logs (id, Num) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 1),
(6, 2),
(7, 2);


SELECT DISTINCT res.Num FROM (
	SELECT Num, 
		CASE
	    	WHEN @prev = Num THEN @count := @count + 1
			WHEN @prev := Num THEN @count := 1
	  	END AS n
	FROM Logs, (SELECT @prev := NULL, @count := 0) r
) res
WHERE res.n >= 3

