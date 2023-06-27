package com.campanha_de_vendas.DTO;

import com.campanha_de_vendas.model.entity.Meta;
import com.campanha_de_vendas.model.entity.Representante;

import java.util.List;

public class RepresentanteDTO {
    private Long id;

    private String nome;

    private List<Meta> metaList;

    public RepresentanteDTO(Long id, String nome, List<Meta> metaList) {
        this.id = id;
        this.nome = nome;
        this.metaList = metaList;
    }

    public RepresentanteDTO(Representante representante) {
        this.id = representante.getId();
        this.nome = representante.getNome();
        this.metaList = representante.getMetaList();
    }

    public RepresentanteDTO() {
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

    public Representante toEntity(){
        return new Representante(this.id, this.nome, this.metaList);
    }
}
