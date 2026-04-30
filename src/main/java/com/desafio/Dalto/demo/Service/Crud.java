package com.desafio.Dalto.demo.Service;

import com.desafio.Dalto.demo.Banco.Clientes;
import com.desafio.Dalto.demo.Repository.ClientesRepository;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Crud {
    private final ClientesRepository repositorio;

    public Crud(ClientesRepository repository){
        this.repositorio = repository;
    }
    public List<Clientes> listar(){
        return repositorio.findAll();

    }
    public Clientes Criar(Clientes cliente){
        return repositorio.save(cliente);
    }
    public Clientes Buscar(Long id){
        return repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
    public Clientes Atualizar(Long id, Clientes dados){
        Clientes c = Buscar(id);
        c.setNome(dados.getNome());
        c.setEmail(dados.getEmail());
        return repositorio.save(new Clientes());
    }
    public void Excluir(Long id){
        repositorio.deleteById(id);
    }
}
