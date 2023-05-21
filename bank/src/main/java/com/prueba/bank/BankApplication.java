package com.prueba.bank;

import com.prueba.bank.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	public BankApplication (@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
	}
}
