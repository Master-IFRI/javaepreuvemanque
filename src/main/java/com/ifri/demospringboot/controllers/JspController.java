package com.ifri.demospringboot.controllers;

import com.ifri.demospringboot.model.Client;
import com.ifri.demospringboot.model.Livraison;
import com.ifri.demospringboot.repositories.ClientRepository;
import com.ifri.demospringboot.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JspController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private LivraisonRepository livraisonRepository;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String clientsList(Model model) {
        List<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "clients";
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.GET)
    public String ListLivraisons(Model model, @PathVariable long id) {
        Client oneClient = clientRepository.getById(id);
        List<Livraison> livraisons = livraisonRepository.findLivraisonByDestination(oneClient);
        model.addAttribute("livraisons", livraisons);
        return "livraisons";
    }

    @GetMapping(value = "/clients/new")
    public String clientForm(Model model) {
        model.addAttribute("client", new Client());
        return "addClient";
    }

    @PostMapping(value = "/clients/save")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientRepository.save(client);
        return "redirect:/clients";
    }
}
