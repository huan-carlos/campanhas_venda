package com.campanha_de_vendas.DTO;

import com.campanha_de_vendas.model.entity.Campanha;
import com.campanha_de_vendas.model.entity.Meta;

import java.time.LocalDate;
import java.util.List;

public class CampanhaDTO {
    private Long id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Meta> metaList;

    public CampanhaDTO(Long id, String nome, LocalDate dataInicio, LocalDate dataFim, List<Meta> metaList) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.metaList = metaList;
    }

    public CampanhaDTO(Campanha campanha) {
        this.id = campanha.getId();
        this.nome = campanha.getNome();
        this.dataInicio = campanha.getDataInicio();
        this.dataFim = campanha.getDataFim();
        this.metaList = campanha.getMetaList();
    }

    public CampanhaDTO() {
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Meta> getMetaList() {
        return metaList;
    }

    public void setMetaList(List<Meta> metaList) {
        this.metaList = metaList;
    }

    public Campanha toEntity(){
        return new Campanha(this.id, this.nome, this.dataInicio, this.dataFim, this.metaList);
    }

    @Override
    public String toString() {
        return "CampanhaDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", metaTotal=" + metaList.stream().mapToDouble(Meta::getValor_meta).sum() +
                '}';
    }
}
