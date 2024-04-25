package com.example.lab4_20206456.controller;

import com.example.lab4_20206456.entity.Empleados;
import com.example.lab4_20206456.repository.EmpleadoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/empleados")
public class EmpleadosController {

    final EmpleadoRepository empleadoRepository;

    public EmpleadosController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping(value = {""})
    public String listarEmpleados(Model model){
        List<Empleados> empleadosList = empleadoRepository.listarEmpleados();
        model.addAttribute("listaEmpleados", empleadosList);
        return "empleados";
    }

}
