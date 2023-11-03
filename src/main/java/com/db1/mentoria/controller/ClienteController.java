package com.db1.mentoria.controller;

import com.db1.mentoria.repository.ClienteRepository;
import com.db1.mentoria.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/cliente")
public class ClienteController {
    private ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping(path = "/teste")
    public String testeCliente() {
        System.out.println("Deu certo");
        service.executar();
        return "ok";
    }
}
