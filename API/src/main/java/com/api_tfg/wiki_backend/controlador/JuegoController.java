package com.api_tfg.wiki_backend.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_tfg.wiki_backend.modelo.Juego;
import com.api_tfg.wiki_backend.servicio.JuegoService;

@RestController
@RequestMapping("/api/juegos")
@CrossOrigin(origins = "")//esta vacio, pero nos permitira que conectemos el frontend
public class JuegoController {
    
    @Autowired
    private JuegoService juegoService;

    @GetMapping
    public List<Juego> listar(){
        return juegoService.obtenerTodos();
    }
}
