package com.api_tfg.wiki_backend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api_tfg.wiki_backend.modelo.Juego;

public interface JuegoRepository extends JpaRepository<Juego, Long> {
    
}
