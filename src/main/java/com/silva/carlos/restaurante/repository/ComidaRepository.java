package com.silva.carlos.restaurante.repository;

import com.silva.carlos.restaurante.domain.Comida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comida, Long> {
    @Override
    Page<Comida> findAll(Pageable pageable);

    boolean existsByNome(String nome);
}
