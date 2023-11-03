package com.db1.mentoria.entity;

import java.time.LocalDateTime;

public class Cliente {
    private String nome;
    private Long id;
    private LocalDateTime dataNascimento;

    public Cliente(String nome, Long id, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
    }
}
