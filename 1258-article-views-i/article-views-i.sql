# Write your MySQL query statement below


select Distinct author_id as id from Views
##group by author_id

where  viewer_id = author_id
order by id;
