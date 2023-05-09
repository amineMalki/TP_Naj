package com.gestionspectacles.config;

import com.gestionspectacles.model.Client;
import com.gestionspectacles.model.Spectacle;
import com.gestionspectacles.repository.ClientRepository;
import com.gestionspectacles.repository.SpectacleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository cRepo) {
        return args -> {
            Client un = new Client("Rickman", "Alan", "a.rick@gmail.com", "abcdef",
                    "175, rue Gent, Laval,QC", "Visa");
            Client deux = new Client("Johnson", "John", "john.john@hotmail.com", "12345",
                    "1289, rue Jolie, Montreal,QC", "MasterCard");
            Client trois = new Client("Salomon", "Simon", "simsal@gmail.com", "Taureau",
                    "43, rue Rose, Laval,QC", "Visa");
            Client quatre = new Client("Boucher", "Brian", "bribri@gmail.com", "Rouge",
                    "837, avenue Denis, St-Bruno,QC", "Visa");
            Client cinq = new Client("Payne", "Justin", "jj.payne@yahoo.com", "Poisson2",
                    "175, blvd Levesque, Montreal,QC", "MasterCard");

            cRepo.saveAll(List.of(un, deux, trois, quatre, cinq));

        };
    }


}
