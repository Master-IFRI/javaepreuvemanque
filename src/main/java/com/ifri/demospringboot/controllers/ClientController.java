package com.ifri.demospringboot.controllers;

import com.ifri.demospringboot.model.Client;
import com.ifri.demospringboot.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/new")
    public ResponseEntity<?> createProperty(@RequestBody Client client) {
        Client toSave = clientRepository.save(client);
        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/client/{id}")
                .buildAndExpand(toSave.getId()).toUri();
        return ResponseEntity.created(location).body("Client added successfully");
    }

    @GetMapping("/")
    public ResponseEntity afficherTousLesClients() {
        return new ResponseEntity(clientRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping("/raisonsociale/{raisonSociale}")
    public ResponseEntity oneLocationProperty(@PathVariable String raisonSociale) {
        return new ResponseEntity(clientRepository.findByRaisonSociale(raisonSociale), HttpStatus.OK);

    }

}
