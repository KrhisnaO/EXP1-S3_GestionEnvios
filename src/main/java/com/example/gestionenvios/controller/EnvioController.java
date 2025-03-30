package com.example.gestionenvios.controller;

import com.example.gestionenvios.model.Envio;
import com.example.gestionenvios.service.EnvioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/envios")

public class EnvioController {
    private final EnvioService envioService;

    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;
    }

    //OBTENER TODOS LOS ENVIOS DE LA BBDD EN MEMORIA
    @GetMapping
    public List<Envio> getEnvios() {
        return envioService.getEnvios();
    }

    //OBTENER ENVIOS POR N SEGUIMIENTO
    @GetMapping("{numeroSeguimiento}")
    public Envio getEnvioBynumeroSeguimiento(@PathVariable int numeroSeguimiento) {
        return envioService.getEnvioBynumeroSeguimiento(numeroSeguimiento);
    }

    
}
