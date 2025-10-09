# Write your MySQL query statement below
select r.contest_id,ROUND((COUNT(DISTINCT r.user_id) / (SELECT COUNT(*) FROM Users) * 100), 2) AS percentage from Users u
join Register r on u.user_id=r.user_id group by r.contest_id order by round((count(r.user_id)/3*100),2) desc,
r.contest_id asc;