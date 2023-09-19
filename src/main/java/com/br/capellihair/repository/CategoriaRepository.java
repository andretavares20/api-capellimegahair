package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel,Long> {
    
}
