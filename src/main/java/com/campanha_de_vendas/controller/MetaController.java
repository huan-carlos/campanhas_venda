package com.campanha_de_vendas.controller;

import com.campanha_de_vendas.DTO.MetaDTO;
import com.campanha_de_vendas.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/meta")
public class MetaController {
    @Autowired
    private MetaService metaService;

    @PostMapping
    public void criarMeta(MetaDTO metaDTO){
        metaService.save(metaDTO);
    }

    @DeleteMapping
    public void excluirMeta(MetaDTO metaDTO){
        metaService.delete(metaDTO);
    }

    @GetMapping("/campanha/{id}")
    public List<MetaDTO> pesquisaMetaPorCampanha(@PathVariable Long id){
        return null;
    }
}
