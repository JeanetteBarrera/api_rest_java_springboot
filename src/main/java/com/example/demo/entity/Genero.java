
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Genero {
    
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String imagen;
    @Column
    @ManyToMany
    private Pelicula pelicula;

    public Genero() {
    }

    public Genero(Integer id, String nombre, String imagen, Pelicula pelicula) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.pelicula = pelicula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
    
}
