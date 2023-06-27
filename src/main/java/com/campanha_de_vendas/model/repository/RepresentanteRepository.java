package com.campanha_de_vendas.model.repository;

import com.campanha_de_vendas.model.entity.Representante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepresentanteRepository extends JpaRepository<Representante, Long> {
    List<Representante> findAllByNomeContainingIgnoreCase(String nome);
}
