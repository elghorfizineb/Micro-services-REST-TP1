package org.exemple.comptetp.web;

import org.exemple.comptetp.entities.compte;
import org.exemple.comptetp.repositories.compteRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CompteRestController {

    private compteRepo compteRepo;

    public CompteRestController(compteRepo compteRepo) {
        this.compteRepo = compteRepo;
    }

    @GetMapping(path="/comptes")
    public List<compte> listComptes(){
        return  compteRepo.findAll();
    }

    @GetMapping(path="/comptes/{id}")
    public compte getCompte(@PathVariable Long id){
        return  compteRepo.findById(id).get();
    }

    @PostMapping(path="/creer")
    public compte creercompte(@RequestBody compte compte)
    {
        return compteRepo.save(compte);
    }

    @PutMapping(path="/update/{id}")
    public compte update(@PathVariable Long id,@RequestBody compte compte){
        compte.setIdCpt(id);
        return compteRepo.save(compte);
    }

    @DeleteMapping(path="/delete/{id}")
    public void delete(@PathVariable Long id){
        compteRepo.deleteById(id);

    }


}
