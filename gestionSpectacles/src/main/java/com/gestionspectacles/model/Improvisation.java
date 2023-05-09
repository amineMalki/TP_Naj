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
public class Improvisation extends Spectacle{

    private String equipePrincipale, equipeSecondaire;

    public Improvisation() {
    }

    public Improvisation(int nbPlaces, String heure, String titre, String type, String description, String dateSpectacle, double prixSpectacle, String equipePrincipale, String equipeSecondaire) {
        super(nbPlaces, heure, titre, type, description, dateSpectacle, prixSpectacle);
        this.equipePrincipale = equipePrincipale;
        this.equipeSecondaire = equipeSecondaire;
    }

    public String getEquipePrincipale() {
        return equipePrincipale;
    }

    public void setEquipePrincipale(String equipePrincipale) {
        this.equipePrincipale = equipePrincipale;
    }

    public String getEquipeSecondaire() {
        return equipeSecondaire;
    }

    public void setEquipeSecondaire(String equipeSecondaire) {
        this.equipeSecondaire = equipeSecondaire;
    }

    @Override
    public String toString() {
        return "Improvisation{" +
                "equipePrincipale='" + equipePrincipale + '\'' +
                ", equipeSecondaire='" + equipeSecondaire + '\'' +
                '}';
    }
}
