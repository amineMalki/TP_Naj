package com.gestionspectacles.service;

import com.gestionspectacles.model.Client;
import com.gestionspectacles.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientService {

    //attribut
    private ClientRepository clientRepository;

    //constructeur
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //Enregistrer un nouveau client dans la BDD
    public void save(Client client) {
        String courrielRecherche = client.getCourriel();
        Client clientRecherche = clientRepository.getClientByCourriel(courrielRecherche);
        if(clientRecherche == null)
        clientRepository.save(client);
        else {
            throw new IllegalStateException("Ce client existe deja!!!");
        }
    }

    //Afficher la liste de clients de la BDD
    public List<Client> getClient(){
        return clientRepository.findAll();
    }

    //Rechercher un client par son courriel
    public Client getClientByCourriel(String courriel){
        if(this.clientRepository.getClientByCourriel(courriel) == null){
            throw new IllegalStateException("Aucun client avec ce courriel: "+courriel);
        }
        return this.clientRepository.getClientByCourriel(courriel);
    }



    //Mettre a jour un client grace a son ID
    @Transactional
    public void updateClient(Integer idClient, String nomClient, String prenomClient) {

            Client client = clientRepository.findById(idClient).orElseThrow(()->new IllegalStateException("erreur"));

            client.setPrenomClient(prenomClient);
            client.setNomClient(nomClient);


    }


    //Supprimer un client par son ID
    public void deleteClient(Integer idClient) {
        boolean exists = clientRepository.existsById(idClient);
        if(!exists){
            throw new IllegalStateException("Aucun client avec cet id: "+idClient);
        }
        clientRepository.deleteById(idClient);
    }

    //Supprimer un client par son courriel et afficher la liste des clients apres suppression
    public List<Client> deleteClientByCourriel(String courriel) {
        Client clientRecherche = clientRepository.getClientByCourriel(courriel);
        if(clientRecherche == null){
            throw new IllegalStateException("Aucun client avec ce courriel: "+courriel);
        }
        clientRepository.deleteById(clientRecherche.getIdClient());
        this.getClient();
        return clientRepository.findAll();
    }

    //Mettre a jour un client par son courriel
    public Client updateClientByCourriel(String courriel, Client client) {
        Client clientRecherche = clientRepository.getClientByCourriel(courriel);
        if (clientRecherche == null) {
            throw new IllegalStateException("Aucun client avec ce courriel: " + courriel);
        }
        if (client.getNomClient() != null)
            clientRecherche.setNomClient(client.getNomClient());
        if (client.getPrenomClient() != null)
            clientRecherche.setPrenomClient(client.getPrenomClient());
        if (client.getAdresse() != null)
            clientRecherche.setAdresse(client.getAdresse());
        if (client.getCourriel() != null)
            clientRecherche.setCourriel(client.getCourriel());
        if (client.getModePaiement() != null)
            clientRecherche.setModePaiement(client.getModePaiement());
        if (client.getMotPasse() != null)
            clientRecherche.setMotPasse(client.getMotPasse());
        Client clientAffiche = new Client();
        if (client.getCourriel() != null)
            clientAffiche = this.clientRepository.getClientByCourriel(client.getCourriel());
        else if (client.getCourriel() == null) {
            clientAffiche = this.clientRepository.getClientByCourriel(clientRecherche.getCourriel());
        }
        return clientAffiche;
    }


}
