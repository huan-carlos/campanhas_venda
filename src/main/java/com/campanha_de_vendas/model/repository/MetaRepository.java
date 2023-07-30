package com.campanha_de_vendas.model.repository;

import com.campanha_de_vendas.model.entity.Meta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetaRepository extends JpaRepository<Meta, Long> {
    List<Meta> findAllByCampanha_Id(Long id);
    List<Meta> findAllByRepresentante_Id(Long id);
}
