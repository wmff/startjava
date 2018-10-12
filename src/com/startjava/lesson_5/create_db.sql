CREATE DATABASE "Jaegers";

\connect Jaegers;

CREATE TABLE IF NOT EXISTS "robots" (
	id			SERIAL		PRIMARY KEY,
	modelName	VARCHAR		UNIQUE NOT NULL,
	mark 		VARCHAR		NOT NULL,
	height		DECIMAL		NOT NULL,
	weight		DECIMAL		NOT NULL,
	status 		VARCHAR		NOT NULL,
	origin 		VARCHAR		NOT NULL,
	launch		VARCHAR		NOT NULL,
	kaijuKill	INTEGER		NOT NULL
);
