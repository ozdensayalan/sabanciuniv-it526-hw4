package edu.sabanciuniv.ozdensayalanhw4.repository;

import edu.sabanciuniv.ozdensayalanhw4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s from Student s where s.id=:id")
    Student findStudentById(int id);
}
