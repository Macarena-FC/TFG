package com.api_tfg.wiki_backend.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api_tfg.wiki_backend.modelo.Juego;
import com.api_tfg.wiki_backend.repositorio.JuegoRepository;

@Service
public class JuegoService {
    
    @Autowired
    private JuegoRepository juegoRepository;

    public List<Juego> obtenerTodos(){
        return juegoRepository.findAll();
    }
}
