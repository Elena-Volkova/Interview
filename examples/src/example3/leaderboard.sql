/*
https://www.hackerrank.com/challenges/contest-leaderboard

The total score of a hacker is the sum of their maximum scores for all of the challenges.
Write a query to print the hacker_id, name, and total score of the hackers ordered by the descending score.
If more than one hacker achieved the same total score, then sort the result by ascending hacker_id.
Exclude all hackers with a total score of 0 from your result.

Hackers
---------------
hacker_id, name

Submissions
---------------------------------------------
submission_id, hacker_id, challenge_id, score

Output
----------------------------
hacker_id, name, total_score

*/

SELECT h.hacker_id, h.name, TEMP.total_score
    FROM Hackers h
    INNER JOIN (
        SELECT hacker_id, SUM(max_score) total_score --select sum of max scores
            FROM (
                SELECT hacker_id, challenge_id, MAX(score) max_score --select by max score
                    FROM Submissions
                    GROUP BY hacker_id, challenge_id)
            GROUP BY hacker_id
            HAVING SUM(max_score) > 0) TEMP --exclude 0 results
    ON h.hacker_id = TEMP.hacker_id
    ORDER BY TEMP.total_score DESC, h.hacker_id ASC; --order by total score then by id