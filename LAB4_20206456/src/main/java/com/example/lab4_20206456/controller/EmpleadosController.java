package com.example.lab4_20206456.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleados")
public class EmpleadosController {
    @GetMapping(value = {""})
    public String listarEmpleados(){
        return "empleados";
    }

}
