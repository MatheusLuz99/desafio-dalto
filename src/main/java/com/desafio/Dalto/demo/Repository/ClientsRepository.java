package com.desafio.Dalto.demo.Repository;

import com.desafio.Dalto.demo.Banco.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clientes, Long> {
}
