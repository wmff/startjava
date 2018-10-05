SELECT * FROM robots;

SELECT * FROM robots WHERE status != 'Destroyed';

SELECT * FROM robots WHERE mark = 'Mark-1' OR mark = 'Mark-6';

SELECT * FROM robots ORDER BY mark DESC;

SELECT * FROM robots WHERE launch = (SELECT MIN(launch) FROM robots);

SELECT * FROM robots WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM robots);

SELECT * FROM robots WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM robots);

SELECT AVG(weight) FROM robots;

UPDATE robots SET kaijuKill=kaijuKill+1 WHERE status != 'Destroyed'

DELETE FROM robots WHERE status='Destroyed';