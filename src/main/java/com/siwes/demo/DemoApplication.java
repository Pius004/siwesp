package com.siwes.demo;

import com.siwes.demo.entity.Gender;
import com.siwes.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student pius = new Student(
					210115011l, "Pius", Gender.MALE, 21, "Computer Science", 300l
					);
			Student bola = new Student(
					210115012l, "Bola", Gender.FEMALE, 30, "Botany Science", 100l
			);
			studentRepository.save(pius);
			studentRepository.save(bola);

		};
	}


}
