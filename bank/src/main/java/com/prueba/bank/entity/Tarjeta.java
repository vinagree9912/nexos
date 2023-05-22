package com.prueba.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarjeta {
    private String numeroTarjeta;
    private String nombreTitular;
    private String fechaVencimiento;
}
