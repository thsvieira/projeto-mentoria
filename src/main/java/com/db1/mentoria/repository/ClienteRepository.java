package com.db1.mentoria.repository;

import com.db1.mentoria.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
