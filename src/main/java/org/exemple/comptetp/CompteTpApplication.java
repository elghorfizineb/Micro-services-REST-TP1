package org.exemple.comptetp;

import org.exemple.comptetp.entities.TypeCompte;
import org.exemple.comptetp.entities.compte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.exemple.comptetp.repositories.compteRepo;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteTpApplication{

    public static void main(String[] args) {
        SpringApplication.run(CompteTpApplication.class, args);
    }

    @Bean
    CommandLineRunner start(compteRepo compteRepo, RepositoryRestConfiguration restConfiguration)
    {
        return args -> {
            restConfiguration.exposeIdsFor(compte.class);
            compteRepo.save(new compte(null, 90000, new Date(), TypeCompte.COURANT ));
            compteRepo.save(new compte(null, 12000, new Date(), TypeCompte.EPARGNE ));
            compteRepo.save(new compte(null, 1500, new Date(), TypeCompte.COURANT ));

            compteRepo.findAll().forEach( cp -> {
                System.out.println(cp.getSolde());
                System.out.println(cp.getType());
            })
            ;


        };
    }


}
