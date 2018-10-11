CREATE DATABASE "Jaegers";

\connect Jaegers;

CREATE TABLE IF NOT EXISTS "robots" (
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