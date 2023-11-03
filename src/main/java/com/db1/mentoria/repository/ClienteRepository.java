package com.db1.mentoria.repository;

import com.db1.mentoria.entity.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {
    public void executar(Cliente cliente) {
        System.out.println("ClienteRepository.executar");
    }
}
