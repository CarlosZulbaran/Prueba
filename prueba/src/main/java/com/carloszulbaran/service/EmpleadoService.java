package com.carloszulbaran.service;

import java.util.*;
import com.carloszulbaran.entity.Empleados;



public interface EmpleadoService {
    public List <Empleados>listar();
    public void guardar(Empleados empleado);
    
}