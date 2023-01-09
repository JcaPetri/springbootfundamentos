package com.springbootfundamentos;

import com.springbootfundamentos.component.CompInt;
import com.springbootfundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootfundamentosApplication implements CommandLineRunner {

	// Lo que estamos inyectando es la Interfaz, que a atravez del metodo
	private ComponentDependency componentDependency;
	private CompInt compInt;		// Aqui inyectamos la interfaz y de ahi accedemos a sus implementaciones

	@Autowired
	public SpringbootfundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
											@Qualifier("compIntImpleDos") CompInt compInt) {
		this.componentDependency = componentDependency;
		this.compInt = compInt;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		compInt.chau();
	}
}
