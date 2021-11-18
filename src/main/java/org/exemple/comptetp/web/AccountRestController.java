package org.exemple.comptetp.web;

import org.exemple.comptetp.dtos.VirementRequestDto;
import org.exemple.comptetp.service.compteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

    @Autowired
    private compteService compteService;

    @PutMapping(path = "/virement")
    public void virement(@RequestBody VirementRequestDto virementRequestDto)
    {
        compteService.virement(virementRequestDto.getIdSource(),virementRequestDto.getIdDest(),virementRequestDto.getMontant());

    }
}
