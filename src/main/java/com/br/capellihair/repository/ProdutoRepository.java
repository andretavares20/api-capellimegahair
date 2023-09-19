package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
