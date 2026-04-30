package com.desafio.Dalto.demo.Service;

import com.desafio.Dalto.demo.Banco.Clientes;
import com.desafio.Dalto.demo.Repository.ClientesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientesService {
    private final ClientesRepository repositorio;

    public ClientesService(ClientesRepository repository) {
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

    public void Excluir(Long id) {

        if (!repositorio.existsById(id)) {
            throw new EntityNotFoundException("Cliente não encontrado");
        }

        repositorio.deleteById(id);
    }
}
