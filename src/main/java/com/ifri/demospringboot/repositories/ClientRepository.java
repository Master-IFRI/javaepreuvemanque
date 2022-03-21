package com.ifri.demospringboot.repositories;

import com.ifri.demospringboot.model.Client;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByIfu(String ifu);

    List<Client> findByAdresse(@DefaultValue("ABOMEY-CALAVI") String adresse);

    List<Client> findByRaisonSociale(String raisonSociale);


}
