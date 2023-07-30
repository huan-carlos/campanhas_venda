package com.campanha_de_vendas.service;

import com.campanha_de_vendas.DTO.CampanhaDTO;
import com.campanha_de_vendas.DTO.MetaDTO;
import com.campanha_de_vendas.model.entity.Meta;
import com.campanha_de_vendas.model.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<MetaDTO> findAllByCampanha_Id(Long id){
        List<Meta> metaList = metaRepository.findAllByCampanha_Id(id);
        return metaList.stream().map(MetaDTO::new).collect(Collectors.toList());
    }

    public List<MetaDTO> findAllByRepresentante_Id(Long id){
        List<Meta> metaList = metaRepository.findAllByRepresentante_Id(id);
        return metaList.stream().map(MetaDTO::new).collect(Collectors.toList());
    }
}
