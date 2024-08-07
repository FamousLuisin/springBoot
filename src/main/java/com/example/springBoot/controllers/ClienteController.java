package com.example.springBoot.controllers;

import com.example.springBoot.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/cliente")
    public Cliente obterCliente(){
        return new Cliente(11, "Noc", "999.999.999-00");
    }

    @GetMapping(path = "/{id}")
    public Cliente obterClienteId(@PathVariable int id){
        return new Cliente(id, "noki", "999.999.999-00");
    }

    @GetMapping()
    public Cliente obterClientePorId(
            @RequestParam(name = "id", defaultValue = "1") int id,
            @RequestParam(name = "nome", defaultValue = "seu nome") String nome){
        return new Cliente(id, nome, "999.999.999-00");
    }
}
