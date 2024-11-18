package com.accenture.desafiojava.mapper;

import com.accenture.desafiojava.model.Aluno;
import com.accenture.desafiojava.dto.AlunoDTO;
import com.accenture.desafiojava.model.Curso;
import com.accenture.desafiojava.dto.CursoDTO;

import org.springframework.stereotype.Component;

@Component
public class InscricaoPopulator {

    public AlunoDTO toAlunoDTO(Aluno aluno) {
        AlunoDTO dto = new AlunoDTO();
        dto.setId(aluno.getId());
        dto.setNome(aluno.getNome());
        dto.setEmail(aluno.getEmail());
        return dto;
    }

    public CursoDTO toCursoDTO(Curso curso) {
        CursoDTO dto = new CursoDTO();
        dto.setId(curso.getId());
        dto.setNome(curso.getNome());
        dto.setDescricao(curso.getDescricao());
        return dto;
    }
}