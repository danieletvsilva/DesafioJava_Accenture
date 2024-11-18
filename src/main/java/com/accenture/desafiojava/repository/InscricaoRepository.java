package com.accenture.desafiojava.repository;

import com.accenture.desafiojava.model.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {
}