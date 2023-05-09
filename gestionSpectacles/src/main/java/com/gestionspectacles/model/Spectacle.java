/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionspectacles.model;

import jakarta.persistence.*;

import java.util.Date;

/**
 *
 * @author tjcor
 */
@Entity
public class Spectacle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSpectacle;
    private int nbPlaces;
    private String titre, type, heure;
    @Column(length = 10000)
    private String description;
    private String dateSpectacle;
    private double prixSpectacle;

    public Spectacle() {
    }

    public Spectacle(int nbPlaces, String heure, String titre, String type, String description, String dateSpectacle, double prixSpectacle) {
        this.nbPlaces = nbPlaces;
        this.heure = heure;
        this.titre = titre;
        this.dateSpectacle = dateSpectacle;
        this.type = type;
        this.description = description;
        this.prixSpectacle = prixSpectacle;
    }

    public int getIdSpectacle() {
        return idSpectacle;
    }

    public void setIdSpectacle(int idSpectacle) {
        this.idSpectacle = idSpectacle;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateSpectacle() {
        return dateSpectacle;
    }

    public void setDateSpectacle(String dateSpectacle) {
        this.dateSpectacle = dateSpectacle;
    }

    public double getPrixSpectacle() {
        return prixSpectacle;
    }

    public void setPrixSpectacle(double prixSpectacle) {
        this.prixSpectacle = prixSpectacle;
    }

}

