package com.accenture.desafiojava.repository;

import com.accenture.desafiojava.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
