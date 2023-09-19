package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.PagamentoModel;

public interface PagamentoRepository extends JpaRepository<PagamentoModel,Long>{
    
}
