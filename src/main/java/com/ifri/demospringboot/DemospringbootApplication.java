package com.ifri.demospringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ifri" })
public class DemospringbootApplication {

//	@Autowired
//	private StudentRepository studentRepository;
//
//	private final SchoolRepository schoolRepository;

//	public DemospringbootApplication(SchoolRepository schoolRepository) {
//		this.schoolRepository = schoolRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}

//	 @Override
	public void run(String... args) throws Exception {

//		studentRepository.save(new Student(12345678, "ROCK", "DUBOIS", "test1@ifri.net", "GL", 20));
//		studentRepository.save(new Student(398765679, "RICHARD", "KIKI", "test2@ifri.net", "SIRI", 30));
//		studentRepository.save(new Student(76898760, "FIFAME", "ALINA", "test3@ifri.net", "SI", 25));
//
//		Student studiantWithSchool = new Student(76898760, "KOUKPAKI", "Jean-Pierre", "test4@ifri.net", "GL", 30);
//		List<School> schools = schoolRepository.findByName("IFRI");
//
//		studiantWithSchool.setSchool(schools.get((0)));
//		studentRepository.save(studiantWithSchool);
//
//		System.out.println("Il y a " + studentRepository.count() + " étudiants dans la BDD");
//
//		schoolRepository.save(new School("IFRI", "Calavi"));
//		schoolRepository.save(new School("ENEAM", "Cotonou"));

		// System.out.println("Il y a " + schoolRepository.count() + " écoles dans la
		// BDD");

	}

}
