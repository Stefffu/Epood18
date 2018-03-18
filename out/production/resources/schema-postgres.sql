DROP TABLE IF EXISTS Toode;
CREATE TABLE Toode(
    id integer NOT NULL,
    nimi character(80),
    kirjeldus character(500),
    kaal real,
    hind real,
    kogus_laos integer
);