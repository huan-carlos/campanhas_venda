package com.campanha_de_vendas.model.repository;

import com.campanha_de_vendas.model.entity.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
    List<Campanha> findAllByDataFimAfter(LocalDate dataFim);
}
