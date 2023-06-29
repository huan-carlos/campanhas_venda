package com.campanha_de_vendas.DTO;

import com.campanha_de_vendas.model.entity.Campanha;
import com.campanha_de_vendas.model.entity.Meta;
import com.campanha_de_vendas.model.entity.Representante;

public class MetaDTO {
    private Long id;

    private Long id_campanha;

    private Long id_representante;

    private Double valor_meta;

    public MetaDTO(Long id, Long id_campanha, Long id_representante, Double valor_meta) {
        this.id = id;
        this.id_campanha = id_campanha;
        this.id_representante = id_representante;
    }

    public MetaDTO(Meta meta) {
        this.id = meta.getId();
        this.id_campanha = meta.getCampanha().getId();
        this.id_representante = meta.getRepresentante().getId();
        this.valor_meta = meta.getValor_meta();
    }

    public MetaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_campanha() {
        return id_campanha;
    }

    public void setId_campanha(Long id_campanha) {
        this.id_campanha = id_campanha;
    }

    public Long getId_representante() {
        return id_representante;
    }

    public void setId_representante(Long id_representante) {
        this.id_representante = id_representante;
    }

    public Double getValor_meta() {
        return valor_meta;
    }

    public void setValor_meta(Double valor_meta) {
        this.valor_meta = valor_meta;
    }

    public Meta toEntity(){
        return new Meta(this.id, new Campanha(this.id_campanha), new Representante(this.id_representante), this.valor_meta);
    }

    @Override
    public String toString() {
        return "MetaDTO{" +
                "id=" + id +
                ", id_campanha=" + id_campanha +
                ", id_representante=" + id_representante +
                ", valor_meta=" + valor_meta +
                '}';
    }
}