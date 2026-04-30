package com.desafio.Dalto.demo.Controller;

import com.desafio.Dalto.demo.Banco.Clientes;
import com.desafio.Dalto.demo.Repository.ClientesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClientesController {

    private final ClientesRepository repository;
    public ClientesController(ClientesRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Clientes> listar() {
        return repository.findAll();
    }
}
