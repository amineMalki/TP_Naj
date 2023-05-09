DROP DATABASE IF EXISTS gestionSpectaclesBD2;
create database gestionSpectaclesBD2;
use gestionSpectaclesBD2;
CREATE TABLE Client (
idClient int(11) NOT NULL AUTO_INCREMENT,
nomClient varchar(45) NOT NULL,
prenomClient varchar(45) NOT NULL,
courriel varchar(60) NOT NULL,
adresse varchar(60) NOT NULL,
modePaiement varchar(45) NOT NULL,
CONSTRAINT client_id_pk PRIMARY KEY (idClient)
);
INSERT INTO Client (nomClient, prenomClient, courriel, adresse, modePaiement) VALUES
('Federer','Roger','rf@gmail.com','Swis','Visa');
