package com.campanha_de_vendas.model.repository;

import com.campanha_de_vendas.model.entity.Campanha;
import com.campanha_de_vendas.model.entity.Meta;
import com.campanha_de_vendas.model.entity.Representante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetaRepository extends JpaRepository<Meta, Long> {
    List<Meta> findAllByCampanha(Campanha campanha);
    List<Meta> findAllByRepresentante(Representante representante);
}
