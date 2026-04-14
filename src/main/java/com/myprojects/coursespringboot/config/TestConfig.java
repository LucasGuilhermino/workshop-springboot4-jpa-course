package com.myprojects.coursespringboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.myprojects.coursespringboot.entities.User;
import com.myprojects.coursespringboot.repositories.UserRepository;

@Configuration // para indicar para o spring que é uma classe de configuração
@Profile("test") // indica que é classe de configuração exclusiva para o perfil de teste
public class TestConfig implements CommandLineRunner { // vai ter que ter uma dependencia com a classe UserRepository --> fraca (desacoplada) por meio de construtor, Factory, setters
	// database seeding - popular o banco de dados com alguns objetos
	
	@Autowired // para o spring associar uma instância do UserRepository ao TestConfig, resolvendo a dependência
	private UserRepository userRepository;
	
	// Como fazer para executar qdo o programa por iniciado? Implementando CommandLineRunner
	@Override
	public void run(String...args) throws Exception{
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
