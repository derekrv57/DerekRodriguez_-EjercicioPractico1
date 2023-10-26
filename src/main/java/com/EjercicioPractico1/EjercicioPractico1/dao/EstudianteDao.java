/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.EjercicioPractico1.dao;

import com.EjercicioPractico1.EjercicioPractico1.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author derek
 */
public interface EstudianteDao extends JpaRepository <Estudiante,Long>{
    
}
