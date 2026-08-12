-- Last updated: 8/12/2026, 11:16:32 AM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;