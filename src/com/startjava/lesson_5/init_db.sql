CREATE TABLE robots (
	id serial not null primary key,
	modelName VARCHAR(255) unique not null,
	mark varchar(255) not null,
	height decimal not null,
	weight decimal not null,
	status varchar not null,
	origin varchar not null,
	launch varchar not null,
	kaijuKill integer not null
);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Gipsy Danger', 'Mark-3', 79.25, 1.98, 'Destroyed', 'USA', '2017-07-10', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Cherno Alpha', 'Mark-1', 85.34, 2.412, 'Destroyed', 'Russia', '2015', 6);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Guardian Bravo', 'Mark-6', 73.21, 1.975, 'Destroyed', 'China', '2033', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Shaolin Rogue', 'Mark-3', 73.21, 1.975, 'Destroyed', 'China', '2017', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Diablo Intercept', 'Mark-2', 73.21, 1.975, '', 'China', '2016', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Puma Real', 'Mark-2', 73.21, 1.975, '', 'Panama', '2016', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Murder Witch', 'Mark-6', 73.21, 1.975, 'Destroyed', 'China', '2017', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Victory Alpha', 'Mark-3', 73.21, 1.975, 'Destroyed', 'China', '2016', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Obsidian Fury', 'Mark-6', 73.21, 1.975, 'Destroyed', 'China', '2017', 9);

INSERT INTO robots (modelName, mark, height, weight, status, origin, launch, kaijuKill)
    VALUES ('Striker Eureka', 'Mark-5', 73.21, 1.975, 'Destroyed', 'Australia', '2019', 9);
