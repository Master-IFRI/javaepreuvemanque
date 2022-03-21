package com.ifri.demospringboot.controllers;

import com.ifri.demospringboot.repositories.ClientRepository;
import com.ifri.demospringboot.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livraisons")
public class LivraisonController {
    @Autowired
    private LivraisonRepository livraisonRepository;

    @GetMapping("/")
    public ResponseEntity getAllLivraisons() {
        return new ResponseEntity(livraisonRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping("/raisonsociale/{raisonSociale}")
    public ResponseEntity getAllLivraisonsByClients(@PathVariable String raisonSociale) {
        return new ResponseEntity(livraisonRepository.findLivraisonByDestination_RaisonSociale(raisonSociale), HttpStatus.OK);

    }
}
