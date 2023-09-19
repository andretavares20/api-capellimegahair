package com.br.capellihair.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.capellihair.model.UsuarioModel;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    
    @PostMapping
    public UsuarioModel postUsuario(@RequestBody UsuarioModel usuarioModel){

        return null;
    }

    @GetMapping()
    public UsuarioModel getUsuario(@RequestParam("id") Long id){
        return null;
    }

    @PutMapping()
    public UsuarioModel putUsuario(@RequestParam("id") Long id){
        return null;
    }

    @DeleteMapping()
    public UsuarioModel deleteUsuario(@RequestParam("id") Long id){
        return null;
    }


    

}
