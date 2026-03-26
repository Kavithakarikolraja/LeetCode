DELETE from person
where id not in (select id from (SELECT MIN(p.id) as id
from person as p
GROUP by p.email) as temp)