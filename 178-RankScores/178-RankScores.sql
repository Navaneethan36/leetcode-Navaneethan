-- Last updated: 8/12/2026, 11:16:36 AM
# Write your MySQL query statement below
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM 
    Scores;
