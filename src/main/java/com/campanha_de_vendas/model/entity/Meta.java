package com.campanha_de_vendas.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "meta")
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_campanha")
    private Campanha campanha;

    @ManyToOne
    @JoinColumn(name = "id_representante")
    private Representante representante;

    private BigDecimal valor_meta;

    public Meta(Long id, Campanha campanha, Representante representante, BigDecimal valor_meta) {
        this.id = id;
        this.campanha = campanha;
        this.representante = representante;
        this.valor_meta = valor_meta;
    }

    public Meta() {
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
}
