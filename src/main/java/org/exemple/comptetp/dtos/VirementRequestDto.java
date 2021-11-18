package org.exemple.comptetp.dtos;

import lombok.Data;

@Data
public class VirementRequestDto {

    private Long idSource;
    private Long idDest;
    private double montant;
}
