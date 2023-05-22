package com.prueba.bank;

import com.prueba.bank.bean.MyBeanWithProperties;
import com.prueba.bank.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;

	private MyBeanWithProperties myBeanWithProperties;

	public BankApplication (@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBeanWithProperties myBeanWithProperties) {
		this.componentDependency = componentDependency;
		this.myBeanWithProperties = myBeanWithProperties;
	}
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(myBeanWithProperties.function());
		componentDependency.saludar();
	}
}
