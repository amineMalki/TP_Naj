package com.gestionspectacles.controleur;

//import ch.qos.logback.core.model.Model;

import com.gestionspectacles.model.Improvisation;
import com.gestionspectacles.model.Musique;
import com.gestionspectacles.model.Spectacle;
import com.gestionspectacles.model.Theatre;
import com.gestionspectacles.service.SpectacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpectacleControleur {


    @Autowired
    private SpectacleService spectacleService;

    public SpectacleControleur(SpectacleService spectacleService) {
        this.spectacleService = spectacleService;
    }

    //POST (create)
    @PostMapping("/enregistrerMusique") //enregistrer un spectacle de musique
    public void enregistrerSpectacleM(@RequestBody Musique spectacleMusique){
        spectacleService.saveM(spectacleMusique);
    }
    @PostMapping("/enregistrerImpro") //enregistrer un spectacle d'improvisation
    public void enregistrerSpectacleI(@RequestBody Improvisation spectacleImpro){
        spectacleService.saveI(spectacleImpro);
    }
    @PostMapping("/enregistrerTheatre") //enregistrer un spectacle de theatre
    public void enregistrerSpectacleT(@RequestBody Theatre spectacleTheatre){
        spectacleService.saveT(spectacleTheatre);
    }


    @GetMapping("/spectacles")
    public List<Spectacle> list() {

        return spectacleService.listsAll();
    }

    @GetMapping("/rechercheParNom/{titre}")
    public List<Spectacle> findByNameContaining(@PathVariable String titre) {
        return spectacleService.getSpectacleByTitre(titre);
    }

    @GetMapping("/rechercheParDate/{date}")
    public List<Spectacle> getSpectacleByDate(@PathVariable String date) {
        return spectacleService.getSpectacleByDate(date);
    }

    @GetMapping("/rechercheParCategorie/{type}")
    public List<Spectacle> getSpectacleByType(@PathVariable String type) {
        return spectacleService.getSpectacleByType(type);
    }

    @GetMapping("/rechercheParPrixMaximum/{prixSpectacle}")
    public List<Spectacle> getSpectacleByPrix(@PathVariable Double prixSpectacle) {
        return spectacleService.getSpectacleByPrix(prixSpectacle);

    }

    @GetMapping("/modifierNombreDePlacesDisponibles/{nomSpectacle}/{nbPlaces}")
    // retrouver un spectacle par son titre et modifier le nombre de places
    public List<Spectacle> updateSpectacle(@PathVariable String nomSpectacle, @PathVariable int nbPlaces) {
        spectacleService.updateSpectacle(nomSpectacle, nbPlaces);

        return findByNameContaining(nomSpectacle);

    }
    @GetMapping("/supprimerSpectacleParId/{idSpectacle}")
    public List<Spectacle> getSpectacleById(@PathVariable Integer idSpectacle) {
        return spectacleService.deleteSpectacle(idSpectacle);

    }


}
