package com.db1.mentoria.service;

import com.db1.mentoria.dto.ClienteDTO;
import com.db1.mentoria.entity.Cliente;
import com.db1.mentoria.repository.ClienteRepository;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repositoryConstructor) {
        this.repository = repositoryConstructor;
    }

    public void executar(ClienteDTO clienteDTO) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataNascimento = LocalDateTime.parse(clienteDTO.dataNascimento(), formatter);
        Cliente cliente = new Cliente(clienteDTO.nome(), dataNascimento);
        System.out.println("ClienteService.executar");
        repository.save(cliente);
    }
}
