package com.campanha_de_vendas.service;

import com.campanha_de_vendas.DTO.MetaDTO;
import com.campanha_de_vendas.model.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetaService {
    @Autowired
    private MetaRepository metaRepository;

    public void save(MetaDTO metaDTO){
        metaRepository.save(metaDTO.toEntity());
    }

    public void delete(MetaDTO metaDTO){
        metaRepository.delete(metaDTO.toEntity());
    }
}
