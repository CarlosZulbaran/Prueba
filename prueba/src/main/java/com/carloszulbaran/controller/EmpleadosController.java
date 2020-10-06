package com.carloszulbaran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.carloszulbaran.entity.Empleados;
import com.carloszulbaran.service.IEmpleadosService;

import java.util.List;

import com.carloszulbaran.dao.IEmpleadosDao;

@Controller
public class EmpleadosController {
    
@Autowired
private IEmpleadosService iEmpleadosService;
        
        @GetMapping("/")
        public String inicio(Model model){

            List<Empleados>empleados = iEmpleadosService.listar();  

            model.addAttribute("empleados", empleados);
            return "index";
        }

    
        @PostMapping("/guardar")
        public String guardar(Empleados empleados){
        iEmpleadosService.guardar(empleados);
            return "redirect:/";
        }

}