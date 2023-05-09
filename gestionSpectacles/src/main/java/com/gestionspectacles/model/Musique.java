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
public class Musique extends Spectacle {
    
    private String artistePrincipal, artisteSecondaire, genre;

    public Musique() {
    }

    public Musique(String artistePrincipal, String artisteSecondaire, String genre) {
        this.artistePrincipal = artistePrincipal;
        this.artisteSecondaire = artisteSecondaire;
        this.genre = genre;
    }

    public Musique(int nbPlaces, String heure, String titre, String type, String description, String dateSpectacle, double prixSpectacle, String artistePrincipal, String artisteSecondaire, String genre) {
        super(nbPlaces, heure, titre, type, description, dateSpectacle, prixSpectacle);
        this.artistePrincipal = artistePrincipal;
        this.artisteSecondaire = artisteSecondaire;
        this.genre = genre;
    }

    public String getArtistePrincipal() {
        return artistePrincipal;
    }

    public void setArtistePrincipal(String artistePrincipal) {
        this.artistePrincipal = artistePrincipal;
    }

    public String getArtisteSecondaire() {
        return artisteSecondaire;
    }

    public void setArtisteSecondaire(String artisteSecondaire) {
        this.artisteSecondaire = artisteSecondaire;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Musique{" +
                "artistePrincipal='" + artistePrincipal + '\'' +
                ", artisteSecondaire='" + artisteSecondaire + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
