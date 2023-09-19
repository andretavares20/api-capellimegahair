package com.br.capellihair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.capellihair.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {
    
}
