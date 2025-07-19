package com.marcos.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/api/v1/")
public class Controller{

    //Retorna uma mensagem hello para o usuário
    @GetMapping
    public ResponseEntity<String> hello(){
        String hello = "{\"messagem\":\"Hello, World!\"}\n";

        return ResponseEntity
                .status(200)
                .header("Content-Type","application/json")
                .body(hello);
    }

    //recebe um nome no query, e retorna um json com nome<nome> do usuário.
    @GetMapping("param")
    public ResponseEntity<String> nome(
        @RequestParam (required=true) String nome
        ){
        String corpo = "{\"Nome\":" + "\""+nome+"\"}\n";

        return ResponseEntity
                .status(200)
                .header("Content-Type", "application/json")
                .body(corpo);
    }

    
} 