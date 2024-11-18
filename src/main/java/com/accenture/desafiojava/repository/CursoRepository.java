package com.accenture.desafiojava.repository;

import com.accenture.desafiojava.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}