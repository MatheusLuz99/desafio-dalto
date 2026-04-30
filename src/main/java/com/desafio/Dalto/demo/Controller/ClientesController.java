package com.desafio.Dalto.demo.Controller;

import com.desafio.Dalto.demo.Banco.Clientes;
import com.desafio.Dalto.demo.Service.ClientesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    private final ClientesService service;

    public ClientesController(ClientesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Clientes> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Clientes buscar(@PathVariable Long id) {
        return service.Buscar(id);
    }

    @PostMapping
    public Clientes criar(@RequestBody Clientes cliente) {
        return service.Criar(cliente);
    }

    @PutMapping("/{id}")
    public Clientes atualizar(@PathVariable Long id, @RequestBody Clientes dados) {
        return service.Atualizar(id, dados);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.Excluir(id);
    }
}