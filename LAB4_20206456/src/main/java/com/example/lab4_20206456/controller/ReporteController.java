package com.example.lab4_20206456.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reportes")
public class ReporteController {
    @GetMapping(value = {""})
    public String verReportes(){
        return "reportes";
    }

}
