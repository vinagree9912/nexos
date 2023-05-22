package com.prueba.bank.controller;


import com.prueba.bank.entity.Card;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrearTarjetaController {
    @PostMapping("/crear-tarjeta")
    public Card crearTarjeta(@RequestBody Card card) {
        return card;
    }
}
