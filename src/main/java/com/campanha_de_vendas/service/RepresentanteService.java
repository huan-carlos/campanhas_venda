package com.campanha_de_vendas.service;

import com.campanha_de_vendas.DTO.RepresentanteDTO;
import com.campanha_de_vendas.model.entity.Representante;
import com.campanha_de_vendas.model.repository.RepresentanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepresentanteService {
    @Autowired
    private RepresentanteRepository representanteRepository;

    public void save(RepresentanteDTO representanteDTO){
        representanteRepository.save(representanteDTO.toEntity());
    }

    public void delete(RepresentanteDTO representanteDTO){
        representanteRepository.delete(representanteDTO.toEntity());
    }

    public RepresentanteDTO findById(Long id){
        Optional<Representante> auxRepresentante = representanteRepository.findById(id);
        return auxRepresentante.map(RepresentanteDTO::new).orElseGet(RepresentanteDTO::new);
    }

    public List<RepresentanteDTO> findByName(String nome){
        List<Representante> representanteList = representanteRepository.findAllByNomeContainingIgnoreCase(nome);
        return representanteList.stream().map(RepresentanteDTO::new).collect(Collectors.toList());
    }
}
