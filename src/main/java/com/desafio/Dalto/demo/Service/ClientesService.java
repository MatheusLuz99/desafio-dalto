package com.desafio.Dalto.demo.Service;

import com.desafio.Dalto.demo.Banco.Clientes;
import com.desafio.Dalto.demo.Banco.ClientesAuditoria;
import com.desafio.Dalto.demo.Repository.ClientesAuditoriaRepository;
import com.desafio.Dalto.demo.Repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class ClientesService {
    @Autowired
    private ClientesAuditoriaRepository auditoriaRepository;
    private final ClientsRepository repositorio;

    public ClientesService(ClientsRepository repository) {
        this.repositorio = repository;
    }

    public Clientes criar(Clientes cliente) {
        return repositorio.save(cliente);
    }

    public Clientes Buscar(Long id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public List<Clientes> listar() {
        return repositorio.findAll();
    }

    public Clientes Atualizar(Long id, Clientes dados) {
        Clientes c = Buscar(id);
        c.setNome(dados.getNome());
        c.setEmail(dados.getEmail());
        return repositorio.save(c);
    }

    public void excluir(Long id) {

        Clientes cliente = repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        // AUDITORIA
        ClientesAuditoria audit = new ClientesAuditoria();
        audit.setIdCliente(cliente.getId());
        audit.setNome(cliente.getNome());
        audit.setEmail(cliente.getEmail());
        audit.setDataExcluido(LocalDateTime.now());
        auditoriaRepository.save(audit);

        // DELETE FINAL
        repositorio.delete(cliente);
    }public List<ClientesAuditoria> listarExcluidos() {
        return auditoriaRepository.findAll();
    }
    }



