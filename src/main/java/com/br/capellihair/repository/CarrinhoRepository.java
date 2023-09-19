package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.CarrinhoModel;

public interface CarrinhoRepository extends JpaRepository<CarrinhoModel,Long> {
    
}
