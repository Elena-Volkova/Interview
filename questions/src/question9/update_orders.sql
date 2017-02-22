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
