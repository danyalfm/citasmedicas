package com.example.examen1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controlador {

    private List<String> valores = new ArrayList<>();

    @RequestMapping(path ="/examen1")
    public String Lista (Model model){

        model.addAttribute("vista", valores);
        return "vista";
    }

    @PostMapping("/add")
    public String add(String nuevo, String nuevo1, String nuevo2, String nuevo3){
        valores.add(nuevo);
        valores.add(nuevo1);
        valores.add(nuevo2);
        valores.add(nuevo3);
        return "redirect:/examen1";
    }

}
