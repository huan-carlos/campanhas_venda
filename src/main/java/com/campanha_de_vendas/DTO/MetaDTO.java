package com.campanha_de_vendas.DTO;

import com.campanha_de_vendas.model.entity.Campanha;
import com.campanha_de_vendas.model.entity.Meta;
import com.campanha_de_vendas.model.entity.Representante;

import java.math.BigDecimal;

public class MetaDTO {
    private Long id;

    private Campanha campanha;

    private Representante representante;

    private BigDecimal valor_meta;

    public MetaDTO(Long id, Campanha campanha, Representante representante) {
        this.id = id;
        this.campanha = campanha;
        this.representante = representante;
    }

    public MetaDTO(Meta meta) {
        this.id = meta.getId();
        this.campanha = meta.getCampanha();
        this.representante = meta.getRepresentante();
    }

    public MetaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public BigDecimal getValor_meta() {
        return valor_meta;
    }

    public void setValor_meta(BigDecimal valor_meta) {
        this.valor_meta = valor_meta;
    }

    public Meta toEntity(){
        return new Meta(this.id, this.campanha, this.representante, this.valor_meta);
    }
}
