package com.br.capellihair.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.capellihair.model.Estoque;
import com.br.capellihair.model.Produto;
import com.br.capellihair.model.dto.ProdutoQuantidadeDto;
import com.br.capellihair.repository.EstoqueRepository;
import com.br.capellihair.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    EstoqueRepository estoqueRepository;
    
    public Estoque postProduto(Produto produto){
        
        Produto produtoDb = produtoRepository.save(produto);

        Estoque estoque = estoqueRepository.findById(produtoDb.getId()).get();

        if(estoque!=null){
            Integer quantidade = estoque.getQuantidade();
            quantidade += 1;
            
        }

        Estoque estoqueDb = estoqueRepository.save(estoque);

        return estoqueDb;

    }

    public List<Estoque> postListProduto(List<ProdutoQuantidadeDto> listProdutoQuantidadeDtos){

        List<Estoque> listEstoqueResponse = new ArrayList<Estoque>();
        
        for(ProdutoQuantidadeDto produtoQuantidadeDto:listProdutoQuantidadeDtos){
            
            Produto produtoDb = produtoRepository.save(produtoQuantidadeDto.getProduto());

            Estoque estoque = new Estoque(produtoDb,produtoQuantidadeDto.getQuantidade());

            Estoque estoqueDb = estoqueRepository.save(estoque);

            listEstoqueResponse.add(estoqueDb);

        }

        return listEstoqueResponse;

    }

}
