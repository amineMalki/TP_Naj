package com.gestionspectacles.service;

import com.gestionspectacles.model.Improvisation;
import com.gestionspectacles.model.Musique;
import com.gestionspectacles.model.Spectacle;
import com.gestionspectacles.model.Theatre;
import com.gestionspectacles.repository.SpectacleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SpectacleService {
    String message = "Voici le résultat de votre recherche :";
    @Autowired
    private SpectacleRepository spectacleRepository;

    @Transactional
    //Update spectacle par titre
    public void updateSpectacle(String titre, int nbPlaces) {

        Spectacle spectacle = spectacleRepository.findByName(titre);

        spectacle.setNbPlaces(nbPlaces);
    }



    public void saveM(Musique spectacle) {
        spectacleRepository.save(spectacle);
    }

    public void saveI(Improvisation spectacle) {
        spectacleRepository.save(spectacle);
    }

    public void saveT(Theatre spectacle) {
        spectacleRepository.save(spectacle);
    }

    public List<Spectacle> listsAll() {
        if (spectacleRepository.findAll().isEmpty()) {
            throw new IllegalStateException("Il n'y a aucun spectacle dans la base de données");

        } else {
            return spectacleRepository.findAll();
        }
    }
    public List<Spectacle> getSpectacleByTitre(String titre) {
        if(spectacleRepository.findByNameContaining(titre).isEmpty()){

            throw new IllegalStateException("Il n'y a aucun spectacle avec ce titre: " + titre);

    }else {
            return spectacleRepository.findByNameContaining(titre);
        }
    }



    public List<Spectacle> getSpectacleByType(String type) {
     if(spectacleRepository.getSpectacleByType(type).isEmpty()){
            throw new IllegalStateException("Il n'y a aucun spectacle avec ce type: " + type);
        }else {
            return spectacleRepository.getSpectacleByType(type);
     }
    }


    public List<Spectacle> getSpectacleByDate(String date) {
        if(spectacleRepository.findByDate(date).isEmpty()){
            throw new IllegalStateException("Il n'y a aucun spectacle à notre programmation à cette date: " + date);

        }else {
            return spectacleRepository.findByDate(date);
        }
    }

    public List<Spectacle> getSpectacleByPrix(Double prixSpectacle) {
        if(spectacleRepository.findByPrix(prixSpectacle).isEmpty()){
            throw new IllegalStateException("Il n'y a aucun spectacle à notre programmation à ce prix: " + prixSpectacle);

    }else {
            return spectacleRepository.findByPrix(prixSpectacle);
        }
    }


    //DELETE (delete)
    public List<Spectacle> deleteSpectacle(Integer idSpectacle) {
        boolean exists = spectacleRepository.existsById(idSpectacle);
        if (!exists) {
            throw new IllegalStateException("Il n'y a aucun spectacle avec cet id: " + idSpectacle);
        }
        spectacleRepository.deleteById(idSpectacle);
        this.listsAll();
        return spectacleRepository.findAll();
    }



}
