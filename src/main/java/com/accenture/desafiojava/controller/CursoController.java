package com.accenture.desafiojava.controller;

import com.accenture.desafiojava.model.Curso;
import com.accenture.desafiojava.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public Curso cadastrarCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }
}