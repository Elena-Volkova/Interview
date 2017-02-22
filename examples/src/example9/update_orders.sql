/*
orders
---------------------
id, name, order_index

order_index - unique constraint

1. Delete records where id = 1 and decrease all indexes after row was deleted.

duplicates
-------------
id, name, description, enabled

2. Remove all duplicates by name. As a result table should contain only one row: "(1, "test", "desc1", true)"

 */

DELETE FROM orders WHERE id = 1;
-- Error Code: 1062. Duplicate entry '5' for key 'orders_index_UNIQUE'
-- It tries to update one by one, but we have already had order_index = 5 (it must be unique)
UPDATE orders SET orders_index = orders_index - 1 WHERE orders_index > 3;
UPDATE orders SET orders_index = orders_index - 1 WHERE orders_index > 3 ORDER BY orders_index;


-- You can't specify target table 'duplicates' for update in FROM clause -> TEMP table created

DELETE FROM duplicates WHERE id NOT IN (
	SELECT id FROM (
		SELECT id FROM duplicates GROUP BY name
	) AS TEMP
);