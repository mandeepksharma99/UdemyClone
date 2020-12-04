package com.dev.learningPlatform;

import com.dev.learningPlatform.entity.Instructor;
import com.dev.learningPlatform.entity.Student;
import com.dev.learningPlatform.entity.StudentDetail;
import com.dev.learningPlatform.repository.InstructorRepo;
import com.dev.learningPlatform.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningPlatformApplication implements CommandLineRunner {

	@Autowired
	public StudentRepo studentRepo;
	@Autowired
	public InstructorRepo instructorRepo;


	public static void main(String[] args) {
		SpringApplication.run(LearningPlatformApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student st = new Student();
		st.setFirstName("Mandeep");
		st.setLastName("Sharma");
		StudentDetail sd = new StudentDetail();
		sd.setCourse(1);
		sd.setGender(1);
		st.setStudentDetail(sd);
		System.out.println(studentRepo.save(st));
		Instructor is = new Instructor();
		is.setFirstName("mks");
		is.setLastName("kk");
		System.out.println(instructorRepo.save(is));

		System.out.println(studentRepo.getOne(st.getId()));
	}
}
