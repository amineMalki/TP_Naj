/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionspectacles.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;

import java.util.Date;

/**
 *
 * @author tjcor
 */
@Entity
@Inheritance
public class Theatre extends Spectacle {
    
    private String compagnie, auteur;

    public Theatre() {
    }

    public Theatre(int nbPlaces, String heure, String titre, String type, String description, String dateSpectacle, double prixSpectacle, String compagnie, String auteur) {
        super(nbPlaces, heure, titre, type, description, dateSpectacle, prixSpectacle);
        this.compagnie = compagnie;
        this.auteur = auteur;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "compagnie='" + compagnie + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
