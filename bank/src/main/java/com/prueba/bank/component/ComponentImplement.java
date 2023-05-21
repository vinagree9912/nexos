package com.prueba.bank.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("hola");
    }
}
