package com.desafio.Dalto.demo.Repository;

import com.desafio.Dalto.demo.Banco.ClientesAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesAuditoriaRepository extends JpaRepository<ClientesAuditoria, Long> {
}
