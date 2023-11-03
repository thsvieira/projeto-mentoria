package com.db1.mentoria.service;

import com.db1.mentoria.entity.Cliente;
import com.db1.mentoria.repository.ClienteRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repositoryConstructor) {
        this.repository = repositoryConstructor;
    }

    public void executar() {
        Cliente cliente = new Cliente("Thalisson", 1L, LocalDateTime.now());
        System.out.println("ClienteService.executar");
        repository.executar(cliente);
    }
}
