package org.exemple.comptetp.service;

import org.exemple.comptetp.entities.compte;
import org.exemple.comptetp.repositories.compteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class compteServiceImpl implements compteService{

    @Autowired
    private compteRepo compteRepo;


    @Override
    public void virement(Long idSource, Long idDest, double montant) {

        compte c1 = compteRepo.getById(idSource);
        compte c2 = compteRepo.getById(idDest);

        c1.setSolde(c1.getSolde() - montant);
        c2.setSolde(c2.getSolde() + montant);
        compteRepo.save(c1);
        compteRepo.save(c2);

    }
}
