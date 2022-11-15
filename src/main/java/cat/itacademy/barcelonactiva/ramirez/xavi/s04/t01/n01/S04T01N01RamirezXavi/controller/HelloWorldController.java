package cat.itacademy.barcelonactiva.ramirez.xavi.s04.t01.n01.S04T01N01RamirezXavi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String Saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {

        return "Hola, " + nom + "Estas executant un projecte Maven";
    }

    @RequestMapping("/HelloWorld?nom=El meu nom")
    public String Saluda2(@PathVariable(required = false) String nom) {
        return "Hola, " + nom + "Estas executant un projecte Maven";

    }
}




