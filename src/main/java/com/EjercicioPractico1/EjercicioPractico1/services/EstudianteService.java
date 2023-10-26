/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.EjercicioPractico1.services;

import com.EjercicioPractico1.EjercicioPractico1.domain.Estudiante;
import java.util.List;

/**
 *
 * @author derek
 */
public interface EstudianteService {
    public List<Estudiante> getEstudiantes(boolean activos);
    
    // Se obtiene un Estudiante, a partir del id de un estudiante
    public Estudiante getEstudiante(Estudiante estudiante);
    
    // Se inserta un nuevo estudiante si el id del estudiante esta vacío
    // Se actualiza un estudiante si el id del estudiante NO esta vacío
    public void save(Estudiante estudiante);
    
    // Se elimina el estudiante que tiene el id pasado por parámetro
    public void delete(Estudiante estudiante);
}
