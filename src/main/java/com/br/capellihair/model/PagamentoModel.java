package com.br.capellihair.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class PagamentoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor;

    private LocalDate dataPagamento;

    @OneToOne(mappedBy = "pagamento")
    private CarrinhoModel carrinho;

    @ManyToOne
    @JoinColumn(name = "metodo_pagamento_id")
    private MetodoPagamentoModel metodoPagamento;

}
