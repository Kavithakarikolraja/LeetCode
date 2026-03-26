# Write your MySQL query statement below


Select   b.name as Department , a.name as Employee,a.salary as salary
from Employee a left Join Department b
on a.departmentId = b.id
 where a.salary = (SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = b.id);

