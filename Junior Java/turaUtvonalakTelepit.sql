create database turautvonalak;
use turautvonalak;
create table tura(
megnevezes varchar(30) not null primary key,
hossz_km int not null,
szintemelkedes_meter int not null);

insert into tura values ('Spartacus ösvény',11,177);
insert into tura values ('Nagymaros-Hegyes-tető kis kör',8,499);
insert into tura values ('Zebegényi panorámatúra',11,726);
insert into tura values ('Hollókői körtúra',19,564);
insert into tura values ('Vértesi kilátókör',25,486);
insert into tura values ('Zengői emléktúra',16,582);