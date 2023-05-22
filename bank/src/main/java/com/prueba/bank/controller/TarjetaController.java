package com.prueba.bank.controller;


import com.prueba.bank.entity.Tarjeta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarjetaController {
    @PostMapping("/crear-tarjeta")
    public Tarjeta crearTarjeta(@RequestBody Tarjeta tarjeta) {
        // Genera los valores aleatorios y asigna la fecha de vencimiento
        // Aquí puedes usar lógica adicional para generar los valores aleatorios y calcular la fecha de vencimiento
        // También puedes interactuar con una base de datos para almacenar la tarjeta
        return tarjeta;
    }
}
