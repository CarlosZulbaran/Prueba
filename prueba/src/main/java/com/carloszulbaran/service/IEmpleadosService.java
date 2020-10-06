package com.carloszulbaran.service;

import java.util.*;
import com.carloszulbaran.entity.Empleados;
import com.carloszulbaran.dao.IEmpleadosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IEmpleadosService implements EmpleadoService {

    @Autowired
   private IEmpleadosDao iEmpleadosDao;

    @Transactional(readOnly = true)
    public List<Empleados> listar() {
       
        return (List<Empleados>) iEmpleadosDao.findAll();
    }
    
    @Override
    @Transactional
    public void guardar(Empleados empleados) {
        iEmpleadosDao.save(empleados);

    }

}