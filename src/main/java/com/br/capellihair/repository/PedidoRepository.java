package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.PedidoModel;

public interface PedidoRepository extends JpaRepository<PedidoModel,Long> {
    
}
