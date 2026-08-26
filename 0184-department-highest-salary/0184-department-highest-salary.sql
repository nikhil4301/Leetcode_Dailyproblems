# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary
from (
    select * , dense_rank() over (
        partition by departmentId
        order by salary desc
    ) as ranks
    from employee
) e
join department d
on e.departmentId = d.id
where ranks<=1;