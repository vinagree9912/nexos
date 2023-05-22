package com.prueba.bank.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer", nullable = false, unique = true)
    private Long id;

    private String name;

    private Long dni;

}
