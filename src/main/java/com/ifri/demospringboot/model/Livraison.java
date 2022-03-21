package com.ifri.demospringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "article")
    private String article;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client destination;

    @Column(name = "statut")
    private String statut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Client getDestination() {
        return destination;
    }

    public void setDestination(Client destination) {
        this.destination = destination;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
