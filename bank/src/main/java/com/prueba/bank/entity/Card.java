package com.prueba.bank.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tarjeta")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarjeta", nullable = false, unique = true)
    private Long id;
    private String numberCard;
    @OneToOne
    private Customer customer;
    private Date expirationDate;
    @Column(columnDefinition = "long default 0")
    private Long balance;

    @Column(columnDefinition = "ENUM('ACTIVE', 'INACTIVE', 'BLOQUED') DEFAULT 'INACTIVE'")
    private StatusEnum status;
    public enum StatusEnum {
        ACTIVE,
        INACTIVE,
        BLOQUED
    }
}
