package com.carloszulbaran.dao;

import org.springframework.data.repository.CrudRepository;
import com.carloszulbaran.entity.Empleados;

public interface IEmpleadosDao extends CrudRepository<Empleados,Long>{
    
}