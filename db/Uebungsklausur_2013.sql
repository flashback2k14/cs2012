set foreign_key_checks = 0;
drop table if exists Objekte13;
drop table if exists Wohnungen;
drop table if exists Häuser;
drop table if exists Kunden;
drop table if exists Makler;
drop table if exists Besichtigungen;
set foreign_key_checks = 1;

/*Aufgabe: 5a*/
create table Objekte13 (
	Bezeichnung varchar(20),
	Straße varchar(30),
	Hausnummer int, 
	PLZ int,
	Ort varchar(30),
	Wohnfläche int,
	OID int auto_increment primary key
);

create table Wohnungen (
	Etage int,
	ID int,
	foreign key w_id(ID) references Objekte13(OID)
);

create table Häuser ( 
	Grundstücksgröße int,
	ID int,
	foreign key h_id(ID) references Objekte13(OID)
);

create table Kunden (
	Vorname varchar(30),
	Nachname varchar(30),
	KID int auto_increment primary key
);

create table Makler (
	Vorname varchar(30),
	Nachname varchar(30),
	Qualifikation varchar(50),
	MID int auto_increment primary key
);

create table Besichtigungen (
	Zeitpunkt datetime,
	OID int,
	KID int,
	MID int,
	foreign key b_OID(OID) references Objekte13(OID),
	foreign key b_KID(KID) references Kunden(KID),
	foreign key b_MID(MID) references Makler(MID)
);

/*Aufgabe: 5b*/
insert into Objekte13 values (
	'4-Raum-Wohnung',
	'Dorfstraße',
	4,
	12345,
	'Musterdorf',
	94,
	1
);

insert into Wohnungen values (
	2,
	1
);

insert into Objekte13 values (
	'5-Raum-Maisonette',
	'Lindenallee',
	15,
	12345,
	'Musterdorf',
	128,
	2
);

insert into Wohnungen values (
	3,
	2
);

insert into Objekte13 values (
	'Einfamilienhaus',
	'Am Teich',
	4,
	12345,
	'Musterdorf',
	156,
	3
);

insert into Häuser values (
	1200,
	3
);

insert into Objekte13 values (
	'Doppelhaushälfte',
	'Dorfplatz',
	2,
	12345,
	'Musterdorf',
	120,
	4
);

insert into Häuser values (
	400,
	4
);

insert into Kunden values (
	'Max',
	'Muster',
	1
);

insert into Kunden values (
	'Erika',
	'Mustermann',
	2
);

insert into Makler values (
	'Daniel',
	'Haller',
	'Dipl.-Betriebswirt',
	1
);

insert into Makler values (
	'Susi',
	'Sorglos',
	'Schulabbruch',
	2
);

insert into Besichtigungen values (
	'16.01.13 14:35',
	1,
	1,
	1
);

insert into Besichtigungen values (
	'17.01.13 15:00',
	3,
	2,
	1
);

/*Aufgabe: 5c*/
select
	b.Zeitpunkt,
	o.Bezeichnung,
	k.Vorname,
	m.Vorname
from
	Besichtigungen as b
	join Objekte13 as o
	join Kunden as k
	join Makler as m
on
	b.OID = o.OID and
	b.KID = k.KID and
	b.MID = m.MID;

/*Aufgabe: 5d*/
select
	o.Bezeichnung,
	o.Straße,
	o.Hausnummer,
	o.PLZ,
	o.Ort,
	o.Wohnfläche,
	h.Grundstücksgröße
from
	Objekte13 as o
	left outer join Häuser as h
on
	o.OID = h.ID;