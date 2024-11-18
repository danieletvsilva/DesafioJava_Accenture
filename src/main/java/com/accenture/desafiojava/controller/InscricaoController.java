package com.accenture.desafiojava.controller;

import com.accenture.desafiojava.model.Inscricao;
import com.accenture.desafiojava.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @PostMapping
    public Inscricao inscreverAluno(@RequestBody Inscricao inscricao) {
        return inscricaoRepository.save(inscricao);
    }
}