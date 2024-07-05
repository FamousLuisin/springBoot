package com.example.springBoot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "Requisição GET";
    }

    @PostMapping
    public String post(){
        return "Requisição POST";
    }

    @DeleteMapping
    public String delete(){
        return "Requisição DELETE";
    }

    @PutMapping
    public String put(){
        return "Requisição PUT";
    }
}
