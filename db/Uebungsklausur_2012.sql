/*-------------------------------------------------------------------------------------
Frage 1:
Was versteht man unter einem relationalen DBMS?
- DBMS = Datenbankmanagementsystem
- Gesamtheit aller Programme zur Erzeugung, Verwaltung und Manipulation einer Datenbank
- RDBMS = welches intern gemäß dem relationalen Modell organisiert ist

Frage 2:
Was unterscheidet eine Tabelle von einer Relation?
- Relation: 
-- benannte Menge von n-Tupeln
-- n-Tupel: Anordnung von n atomaren, nicht weiter zerlegbaren Attributen
- Tabelle:
-- Unterschied: ein Tupel darf mehrfach auftreten
-- Mathematisch keine Menge

Frage 3: 
Was versteht man unter einem NULL-Value?
- ein unbekannter fehlender Wert
- zeigt an, dass etwas anders als die anderen Werte ist

Frage 4:
Darf das Anlegen eines Index auf die DB zugreifende Anwendungsprogramme beeinträchtigen?
- 

----------------------------------------------------------------------------------------*/


-- Tabellen löschen
SET foreign_key_checks = 0;
DROP TABLE IF EXISTS Objekte;
DROP TABLE IF EXISTS Mehrfachsterne;
DROP TABLE IF EXISTS Pulsare;
DROP TABLE IF EXISTS Nebel;
DROP TABLE IF EXISTS Teleskop;
DROP TABLE IF EXISTS Beobachter;
DROP TABLE IF EXISTS Beobachtung;
SET foreign_key_checks = 1;

-- Aufgabe 7a)
CREATE TABLE Objekte(
	Bezeichnung VARCHAR(20),
	Deklination VARCHAR(20),
	Rektaszension VARCHAR(20),
	Helligkeit DECIMAL(4,2),
	ID INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE Mehrfachsterne(
	Anzahl_Komponenten INT,
	ID INT,
	FOREIGN KEY ID_M(ID) REFERENCES Objekte(ID)
);

CREATE TABLE Pulsare(
	Rotationszeit DOUBLE,
	ID INT,
	FOREIGN KEY ID_P(ID) REFERENCES Objekte(ID)
);

CREATE TABLE Nebel(
	Nebel_Typ VARCHAR(20),
	ID INT,
	FOREIGN KEY ID_N(ID) REFERENCES Objekte(ID)
);

CREATE TABLE Teleskop(
	Teleskop_Name VARCHAR(20),
	Standort VARCHAR(20),
	Spiegeldurchmesser DOUBLE,
	TID INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE Beobachter(
	Name VARCHAR(20),
	Adresse VARCHAR(30),
	Qualifikation VARCHAR(30),
	BID INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE Beobachtung(
	Zeitpunkt DATETIME,
	ID INT,
	BID INT,
	TID INT,
	FOREIGN KEY ID_B(ID) REFERENCES Objekte(ID),
	FOREIGN KEY BID_B(BID) REFERENCES Beobachter(BID),
	FOREIGN KEY TID_B(TID) REFERENCES Teleskop(TID)
);
	
-- Aufgabe 7b)
-- Mehrfachsterne
INSERT INTO Objekte VALUES (
	'61 Cygni',			/*Bezeichnung*/
	'21 h 06 m 53,9 s',		/*Deklination*/
	'+38° 44'' 57,9""',		/*Rektaszension*/
	5.21,				/*Helligkeit*/
	1				/*ID*/
);
--Anzahl Komponenten
INSERT INTO Mehrfachsterne VALUES (
	2,	/*Anzahl_Komponenten*/
	1	/*OBJEKTE ID*/
);
--###########################################
INSERT INTO Objekte VALUES (
	'Mizar',		/*Bezeichnung*/
	'13 h 23 m 55,50 s',	/*Deklination*/
	'+54° 55'' 31,0""',	/*Rektaszension*/
	2.3,			/*Helligkeit*/
	2			/*ID*/
);
--Anzahl Komponenten
INSERT INTO Mehrfachsterne VALUES (
	4,	/*Anzahl_Komponenten*/
	2	/*OBJEKTE ID*/
);

-- Pulsare
INSERT INTO Objekte VALUES (
	'PSR B1919+21',		/*Bezeichnung*/
	'19 h 19 m 16 s',	/*Deklination*/
	'+21° 47''',		/*Rektaszension*/
	NULL,			/*Helligkeit*/
	3			/*ID*/
);
INSERT INTO Pulsare VALUES (
	1.337,	/*Rotationszeit*/
	3	/*OBJEKTE ID*/
);

-- Nebel
INSERT INTO Objekte VALUES (
	'Krebsnebel',		/*Bezeichnung*/
	'5 h 34 m 31,97 s',	/*Deklination*/
	'+22° 0'' 52,10""',	/*Rektaszension*/
	8.4,			/*Helligkeit*/
	4			/*ID*/
);
INSERT INTO Nebel VALUES (
	'Emissionsnebel',	/*Nebel_Typ*/
	4			/*OBJEKTE ID*/
);

-- Teleskope
INSERT INTO Teleskop VALUES (
	'Leviatan',		/*Teleskop_Name*/
	'Birr (Irland)',	/*Standort*/
	1.83,			/*Spiegeldurchmesser*/
	1			/*TID*/
);
INSERT INTO Teleskop VALUES (
	'Hooker-Spiegel',	/*Teleskop_Name*/
	'Mount Wilson',		/*Standort*/
	2.54,			/*Spiegeldurchmesser*/
	2			/*TID*/
);

--Beobachter
INSERT INTO Beobachter VALUES (
	'William Parsons, 3. Earl of Rosse',	/*Name*/
	'Birr Castle, Ireland',			/*Adresse*/
	'Astronom',				/*Qualifikation*/
	1					/*BID*/
);
INSERT INTO Beobachter VALUES (
	'George Ellery Hale',				/*Name*/
	'100 N. Garfield Evenue, Pasadana, CA 91109',	/*Adresse*/
	'Astrophysiker',				/*Qualifikation*/
	2						/*BID*/
);

-- Nicht in Aufgabe: Beobachtung einfügen
INSERT INTO Beobachtung VALUES (
	'1923-10-16 03:17:16',		/*Zeitpunkt*/
	2,				/*ID*/
	2,				/*BID*/
	2				/*TID*/
);
INSERT INTO Beobachtung VALUES (
	'1923-10-17 02:12:34',		/*Zeitpunkt*/
	4,				/*ID*/
	2,				/*BID*/
	2				/*TID*/
);

-- Aufgabe 7c)
SELECT 
	bg.Zeitpunkt, 
	o.Bezeichnung, 
	br.Name,
	t.Teleskop_Name
FROM 
	Beobachtung AS bg 
	JOIN Objekte AS o 
	JOIN Beobachter AS br 
	JOIN Teleskop AS t
ON 
	bg.ID = o.ID AND 
	bg.BID = br.BID AND 
	bg.TID = t.TID;

-- Aufgabe 7d)
SELECT 
	o.Bezeichnung, 
	o.Deklination, 
	o.Rektaszension,
	o.Helligkeit,
	m.An
FROM
	Objekte AS o
	LEFT OUTER JOIN Mehrfachsterne AS m
ON
	o.ID = m.ID;
