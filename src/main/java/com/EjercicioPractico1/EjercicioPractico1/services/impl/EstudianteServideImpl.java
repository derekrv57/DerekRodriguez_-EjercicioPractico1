package com.EjercicioPractico1.EjercicioPractico1.services.impl;


import com.EjercicioPractico1.EjercicioPractico1.dao.EstudianteDao;
import com.EjercicioPractico1.EjercicioPractico1.domain.Estudiante;
import com.EjercicioPractico1.EjercicioPractico1.services.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteServideImpl implements EstudianteService {

    @Autowired
    private EstudianteDao estudianteDao;
    @Override
    @Transactional(readOnly=true)
    public List<Estudiante> getEstudiantes(boolean activos) {
        var lista=estudianteDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public Estudiante getEstudiante(Estudiante estudiante) {
        return estudianteDao.findById((long) estudiante.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(Estudiante estudiante) {
        estudianteDao.delete(estudiante);
    }
}