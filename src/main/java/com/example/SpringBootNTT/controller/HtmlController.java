package com.example.SpringBootNTT.controller;

import com.example.SpringBootNTT.entity.Student;
import com.example.SpringBootNTT.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @Autowired
    private StudentService service;

    @GetMapping("/homepage")
    public String homePage(Model model){
        model.addAttribute("yoSoy","jose" );
        return "home";
        //model.addAttribute("students");
    }

    @GetMapping("/listaAlumnos")
    public String listaDeAlumnos(Model model){
        model.addAttribute("students", service.getList());
        return "alumnos";
        //model.addAttribute("students");
    }

}
