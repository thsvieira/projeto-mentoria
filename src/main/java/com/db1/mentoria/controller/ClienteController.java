package com.db1.mentoria.controller;

import com.db1.mentoria.dto.ClienteDTO;
import com.db1.mentoria.repository.ClienteRepository;
import com.db1.mentoria.service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/cliente")
public class ClienteController {
    private ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping(path = "/teste")
    public String testeCliente(@RequestBody ClienteDTO clienteDTO) {
        System.out.println("Deu certo");
        service.executar(clienteDTO);
        return "ok";
    }

    @GetMapping(path = "/teste/{id}")
    public String testeCliente(@RequestParam Long id) {
        System.out.println("Deu certo");
        return "ok";
    }
}
