package com.taller.taller1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.taller.taller1.models.Estudiante;
import com.taller.taller1.models.Docente;

@Controller
/* @RequestMapping("/index") */
public class IndexController {
    @GetMapping({ "/", "", "/index" })
    public String indeString(Model model) {
        Docente docente = new Docente();
        model.addAttribute("titulo", "Estudiantes");
        model.addAttribute("docente", docente);
        docente.setNombre("Pepito");
        docente.setApellido("Pérez");
        docente.setEdad(45);
        docente.setDocumento("1091202390");
        docente.setTelefono("3223597654");
        docente.setEmail("travesurasPepito@gmail.com");
        docente.setDireccion("CALLE busqueme # Encuentreme");
        model.addAttribute("cuerpo", "Usuario: " + docente.getNombre());
        return "/index";

    }

    @ModelAttribute("estudiantes")

    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante(01, "Andrés", "Ospina",
                        "102921", 20, "31931",
                        "andresnotan69@gmail.com", "Santamaria",
                        "Apps Empresariales"),

                new Estudiante(02, "Mateito", "Ruiz",
                        "1005942", 23, "31455486",
                        "borrachin@gmail.com", "El limonar",
                        "Apps Empresariales"),

                new Estudiante(03, "Andres", "Moreno",
                        "1545521", 19, "32155821",
                        "elnea@gmail.com", "la mariela",
                        "Apps Empresariales"));

        return estudiantes;
    }

}
