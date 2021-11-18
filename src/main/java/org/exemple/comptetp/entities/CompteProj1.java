package org.exemple.comptetp.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name ="p1",types = compte.class)
public interface CompteProj1 {
    public Long getId();
    public double getSolde();
}
