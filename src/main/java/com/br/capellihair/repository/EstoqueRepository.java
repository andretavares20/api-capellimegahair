package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque,Long> {
    
}
