package com.gestionspectacles.controleur;

import com.gestionspectacles.model.Client;
import com.gestionspectacles.model.Spectacle;
import com.gestionspectacles.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientControleur {

    //attribut
    private ClientService clientService;

    //constructeur
    @Autowired
    public ClientControleur(ClientService clientService) {
        this.clientService = clientService;
    }

    //POST (create)
    @PostMapping("/enregistrer") //enregistrer un client
    public void enregistrerClient(@RequestBody Client client){//Via un formulaire : le produit
        clientService.save(client);
    }


    //Afficher la liste de tous les clients de la BDD
    @GetMapping("/client")
    public List<Client> getClient(){
        return clientService.getClient();
    }

    //rechercher un client par courriel
    @GetMapping("/getClientByCourriel/{courriel}")
    public Client getClientByCourriel(@PathVariable String courriel) {
        return clientService.getClientByCourriel(courriel);
    }
    //Mettre a jour un client par son ID
    @PutMapping(path="{idClient}")
    public void updateClient(@PathVariable("idClient") Integer idClient,
                             @RequestParam(required = false) String nomClient,
                             @RequestParam(required = false) String prenomClient){
    clientService.updateClient(idClient,nomClient,prenomClient);
    }

    //Supprimer un client par son ID
    @DeleteMapping(path = "{idClient}")
    public void deleteClient(@PathVariable("idClient")Integer idClient){
        clientService.deleteClient(idClient);
    }

// Supprimer un client par son courriel
    @GetMapping(path = "/deleteClientByCourriel/{courriel}")
    public List<Client> deleteClientByCourriel(@PathVariable("courriel")String courriel){
       return clientService.deleteClientByCourriel(courriel);
    }

    //Mettre a jour un client par son courriel
    @GetMapping(path="/updateClientByCourriel/{courriel}")
    public void updateClientByCourriel(@PathVariable("courriel")String courriel,
                                       @RequestBody Client client ){
        clientService.updateClientByCourriel(courriel, client);
    }
}
