package com.campanha_de_vendas.model.repository;

import com.campanha_de_vendas.model.entity.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
}
