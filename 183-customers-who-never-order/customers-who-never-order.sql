# Write your MySQL query statement below

SELECT name AS Customers 
from Customers c 
left Join 
Orders o on
 c.id = o.customerId
 where o.customerId is null;