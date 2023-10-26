package com.EjercicioPractico1.EjercicioPractico1.controller;

import com.EjercicioPractico1.EjercicioPractico1.domain.Estudiante;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.EjercicioPractico1.EjercicioPractico1.services.EstudianteService;
@Controller
@Slf4j
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;
    @GetMapping("/listado")
    public String inicio(Model model) {
        var estudiantes = estudianteService.getEstudiantes(false);
        model.addAttribute("estudiantes", estudiantes);
        model.addAttribute("totalEstudiantes", estudiantes.size());
        return "/estudiante/listado";
    }
    
    @GetMapping("/nuevo")
    public String estudianteNuevo(Estudiante estudiante) {
        return "/estudiante/modifica";
    }
    
    @PostMapping("/guardar")
    public String estudianteGuardar(Estudiante estudiante) {
        estudianteService.save(estudiante);
        return "redirect:/estudiante/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String estudianteEliminar(Estudiante estudiante) {
        estudianteService.delete(estudiante);
        return "redirect:/estudiante/listado";
    }

    @GetMapping("/modificar/{id}")
    public String estudianteModificar(Estudiante estudiante, Model model) {
        estudiante = estudianteService.getEstudiante(estudiante);
        model.addAttribute("estudiante", estudiante);
        return "/estudiante/modifica";
    }
}