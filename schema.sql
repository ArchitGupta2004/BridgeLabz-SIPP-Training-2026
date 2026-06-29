CREATE DATABASE covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    country VARCHAR(50),
    date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    population BIGINT
);

CREATE TABLE covid_deaths (
    country VARCHAR(50),
    date DATE,
    deaths INT
);

CREATE TABLE covid_vaccines (
    country VARCHAR(50),
    date DATE,
    vaccinated INT
);