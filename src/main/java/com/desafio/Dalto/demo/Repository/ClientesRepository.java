package com.desafio.Dalto.demo.Repository;

import com.desafio.Dalto.demo.Banco.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
