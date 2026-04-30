package com.desafio.Dalto.demo.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "TBL_CLIENTES")

public class Clientes{
        //Onde vai pedir os dados para o usuario!
        @Id            // esse é a chave do usuario
        @GeneratedValue         //peço para gerar IDS

        private Long Id;

        private String nome;

        private String email;
        //Cada private é uma Coluna e cada coluna pediu um dado para o usuario!


        public Long getId() {
            return Id;
        }
        public String getnome() {
           return nome;
        }
        public String getemail() {
            return email;
        }// Essa parte do public vai pegar os dados inseridos pelo usuario e retonar!

        public void setEmail (String email){
            this.email = email;
        }

            


        // @GetMapping
        //public String sayHello() {
          //  return "Hello World";
    }

