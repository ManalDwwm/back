package com.JynInfoConseil.Gestion_Donateurs;

import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GestionDonateursApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(GestionDonateursApplication.class, args);
	}
@Override
public void run(String... args) throws Exception {

	repositoryRestConfiguration.exposeIdsFor(Donateur.class);
}
}
