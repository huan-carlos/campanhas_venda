package com.campanha_de_vendas.service;

import com.campanha_de_vendas.DTO.CampanhaDTO;
import com.campanha_de_vendas.model.entity.Campanha;
import com.campanha_de_vendas.model.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CampanhaService {
    @Autowired
    private CampanhaRepository campanhaRepository;

    public void save(CampanhaDTO campanhaDTO){
        campanhaRepository.save(campanhaDTO.toEntity());
    }

    public void delete(CampanhaDTO campanhaDTO){
        campanhaRepository.delete(campanhaDTO.toEntity());
    }

    public CampanhaDTO findById(Long id){
        Optional<Campanha> auxCampanha = campanhaRepository.findById(id);
        return auxCampanha.map(CampanhaDTO::new).orElseGet(CampanhaDTO::new);
    }

    public List<CampanhaDTO> findAllByDate(){
        List<Campanha> campanhaList = campanhaRepository.findAllByDataFimAfter(LocalDate.now().minusDays(1));
        return campanhaList.stream().map(CampanhaDTO::new).collect(Collectors.toList());
    }
}
