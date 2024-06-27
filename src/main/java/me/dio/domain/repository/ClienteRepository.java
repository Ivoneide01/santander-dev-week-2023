package me.dio.domain.repository;

import me.dio.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Adicione métodos de consulta específicos aqui, se necessário.
}
