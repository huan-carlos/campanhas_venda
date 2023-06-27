package com.campanha_de_vendas.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "representante")
public class Representante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "representante")
    private List<Meta> metaList;

    public Representante(Long id, String nome, List<Meta> metaList) {
        this.id = id;
        this.nome = nome;
        this.metaList = metaList;
    }

    public Representante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Meta> getMetaList() {
        return metaList;
    }

    public void setMetaList(List<Meta> metaList) {
        this.metaList = metaList;
    }
}
