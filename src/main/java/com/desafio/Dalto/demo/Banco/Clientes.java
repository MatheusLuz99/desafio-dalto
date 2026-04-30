package com.desafio.Dalto.demo.Banco;

import jakarta.persistence.*;


@Entity
@Table(name = "TBL_CLIENTES")
public class Clientes {

    //Onde vai pedir os dados para o usuario!
    @Id            // esse é a chave do usuario
    @GeneratedValue(strategy = GenerationType.IDENTITY)         //peço para gerar IDS

    private Long id;

    private String nome;

    private String email;

    //Cada private é uma Coluna e cada coluna pediu um dado para o usuario!

    public Clientes() {
    }
    //Getters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }// Essa parte do public vai pegar os dados inseridos pelo usuario e retonar!


    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

