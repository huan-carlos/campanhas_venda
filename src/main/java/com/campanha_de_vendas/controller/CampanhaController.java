package com.campanha_de_vendas.controller;

import com.campanha_de_vendas.DTO.CampanhaDTO;
import com.campanha_de_vendas.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/campanha")
public class CampanhaController {
    @Autowired
    private CampanhaService campanhaService;

    @PostMapping
    public void criarCampanha(CampanhaDTO campanhaDTO){
        campanhaService.save(campanhaDTO);
    }

    @DeleteMapping
    public void excluirCampanha(CampanhaDTO campanhaDTO){
        campanhaService.delete(campanhaDTO);
    }

    @GetMapping(value = "/{id}")
    public CampanhaDTO pesquisaCampanhaPorId(@PathVariable Long id){
        return campanhaService.findById(id);
    }

    @GetMapping(value = "/vigente")
    public List<CampanhaDTO> pesquisaCampanhasVigente(){
        return campanhaService.findAllByDate();
    }
}
