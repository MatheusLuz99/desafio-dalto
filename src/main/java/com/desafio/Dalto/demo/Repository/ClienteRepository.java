package com.desafio.Dalto.demo.Repository;

import com.desafio.Dalto.demo.controller.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {
}
//Isso serve para habilitar funções como
// findById(Long id)
//findAll()
//save(Cliente c)
//deleteById(Long id)