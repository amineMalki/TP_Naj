package com.gestionspectacles.repository;

import com.gestionspectacles.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

//Requete pour trouver un client par son courriel
    @Query("SELECT c FROM Client c WHERE c.courriel=:courriel")
    public Client getClientByCourriel(String courriel);

}
