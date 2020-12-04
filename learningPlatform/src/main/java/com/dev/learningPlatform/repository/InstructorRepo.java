package com.dev.learningPlatform.repository;

import com.dev.learningPlatform.entity.Instructor;
import com.dev.learningPlatform.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor, Integer> {

}
