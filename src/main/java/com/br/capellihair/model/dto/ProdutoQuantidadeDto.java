package com.br.capellihair.model.dto;

import com.br.capellihair.model.Produto;

import lombok.Data;

@Data
public class ProdutoQuantidadeDto {
    
    private Produto produto;
    private Integer quantidade;

}
