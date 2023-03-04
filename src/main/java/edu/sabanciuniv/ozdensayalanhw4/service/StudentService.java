package edu.sabanciuniv.ozdensayalanhw4.service;


import edu.sabanciuniv.ozdensayalanhw4.model.Student;
import edu.sabanciuniv.ozdensayalanhw4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository StudentRepository;

    public Student addNewStudent(Student student) {
        return StudentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }

    public Student updateExistingStudent(Student Student) {
        return StudentRepository.save(Student);
    }

    public void deleteExistingStudent(Student Student) {
        StudentRepository.delete(Student);
    }

    public Student getStudentById(int id) {
        return StudentRepository.findStudentById(id);
    }
}

