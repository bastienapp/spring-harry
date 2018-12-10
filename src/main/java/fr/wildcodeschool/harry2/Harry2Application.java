package fr.wildcodeschool.harry2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaAuditing
public class Harry2Application {

	public static void main(String[] args) {
		SpringApplication.run(Harry2Application.class, args);
	}
}
