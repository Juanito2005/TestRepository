package org.factoriaf5.java_list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaListApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaListApplication.class, args);
		List<String> H = new ArrayList<>();
		Listas g = new Listas();
		H = g.diasSemana();
		g.largoLista(H);
	}
}
