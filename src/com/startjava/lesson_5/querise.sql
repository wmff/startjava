\connect Jaegers;

-- выведите всю таблицу
SELECT * FROM robots;

-- отобразите только не уничтоженных роботов
SELECT * FROM robots WHERE status != 'Destroyed';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM robots WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM robots ORDER BY mark DESC;

-- отобразите самого старого робота
SELECT * FROM robots ORDER BY launch LIMIT 1;

-- отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM robots WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM robots);
SELECT * FROM robots WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM robots);

-- отобразите средний вес роботов
SELECT AVG(weight) FROM robots;

-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE robots SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';

-- удалите уничтоженных роботов
DELETE FROM robots WHERE status = 'Destroyed';
