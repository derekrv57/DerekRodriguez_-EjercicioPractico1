/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author derek
 */
@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String nombre;
    private String identificacion;
    private String nivel_cursando;
    private String edad;
    private float peso;
    private float altura;
    private String genero;

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String identificacion, String nivel_cursando, String edad, float peso, float altura, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nivel_cursando = nivel_cursando;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }

    
    
}
