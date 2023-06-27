package com.campanha_de_vendas.controller;

import com.campanha_de_vendas.DTO.RepresentanteDTO;
import com.campanha_de_vendas.service.RepresentanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/representante")
public class RepresentanteController {
    @Autowired
    private RepresentanteService representanteService;

    @PostMapping
    public void criarRepresentante(RepresentanteDTO representanteDTO){
        representanteService.save(representanteDTO);
    }

    @DeleteMapping
    public void excluirRepresentante(RepresentanteDTO representanteDTO){
        representanteService.delete(representanteDTO);
    }

    @GetMapping("/{id}")
    public RepresentanteDTO pesquisaRepresentantePorId(@PathVariable Long id){
        return representanteService.findById(id);
    }

    @GetMapping("/nome/{nome}")
    public List<RepresentanteDTO> pesquisaRepresentantePeloNome(@PathVariable String nome){
        System.out.println(nome);
        return representanteService.findByName(nome);
    }
}
