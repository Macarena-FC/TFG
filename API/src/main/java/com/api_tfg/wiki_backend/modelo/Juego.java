package com.api_tfg.wiki_backend.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "juegos")
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String categoria;
    private String descripcion;

    public Juego() {}

    public Long getId() {
         return id; 
        }
    public void setId(Long id) { 
        this.id = id; 
        }
    public String getTitulo() {
         return titulo; 
        }
    public void setTitulo(String titulo) {
         this.titulo = titulo; 
        }
    public String getCategoria() {
         return categoria; 
        }
    public void setCategoria(String categoria) {
         this.categoria = categoria; 
        }
    public String getDescripcion() {
         return descripcion; 
        }
    public void setDescripcion(String descripcion) {
         this.descripcion = descripcion; 
        }
}