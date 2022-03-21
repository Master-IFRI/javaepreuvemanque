package com.ifri.demospringboot.repositories;

import com.ifri.demospringboot.model.Client;
import com.ifri.demospringboot.model.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivraisonRepository extends JpaRepository<Livraison, Long> {

    List<Livraison> findByArticle(String article);

    List<Livraison> findLivraisonByDestination(Client destination);

    List<Livraison> findLivraisonByDestination_RaisonSociale(String destination_raisonSociale);

}
