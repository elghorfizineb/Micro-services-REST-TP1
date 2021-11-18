package org.exemple.comptetp.repositories;

import org.exemple.comptetp.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.exemple.comptetp.entities.compte ;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource
public interface compteRepo extends JpaRepository<compte, Long> {

    @RestResource(path="/byType")
    List<compte> findByType(@Param(value ="type") TypeCompte typeCompte);


}
