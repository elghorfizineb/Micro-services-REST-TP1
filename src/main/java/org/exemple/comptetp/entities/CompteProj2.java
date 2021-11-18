package org.exemple.comptetp.entities;

import org.springframework.data.rest.core.config.Projection;

import java.lang.reflect.Type;

@Projection(name = "p2", types = compte.class)
public interface CompteProj2 {

    double getSolde();
    TypeCompte getType();
}
