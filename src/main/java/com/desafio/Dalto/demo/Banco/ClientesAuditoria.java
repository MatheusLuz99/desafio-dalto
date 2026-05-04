package com.desafio.Dalto.demo.Banco;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CLIENTES_AUDITORIA")
public class ClientesAuditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idOriginal;
    private String nome;
    private String email;

    private LocalDateTime dataExcluido;

    // GETTERS
    public Long getId() { return id; }
    public Long getIdOriginal() { return idOriginal; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public LocalDateTime getDataExcluido() { return dataExcluido; }

    // SETTERS
    public void setIdOriginal(Long idOriginal) { this.idOriginal = idOriginal; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setDataExcluido(LocalDateTime dataExcluido) { this.dataExcluido = dataExcluido; }

    public void setIdCliente(Long id) {
    }
}