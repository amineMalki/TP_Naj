package com.gestionspectacles.controleur;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralControleur {

    @GetMapping("/")

    public String welcome() {
        return "index";
    }


}
