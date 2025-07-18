package com.marcos.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/api/v1/")
public class Controller{

    @GetMapping
    public ResponseEntity<String> hello(){
        String hello = "{\"messagem\":\"Hello, World!\"}";

        return ResponseEntity
                .status(200)
                .header("Content-Type","application/json")
                .body(hello);

    }

    @GetMapping("aaa")
    public ResponseEntity<String> hello01(){
        String hello = "{\"messagem\":\"Hello, World!\"}";

        return ResponseEntity
                .status(200)
                .header("Content-Type","application/json")
                .body(hello);

    }
}