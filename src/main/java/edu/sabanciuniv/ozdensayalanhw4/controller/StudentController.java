package edu.sabanciuniv.ozdensayalanhw4.controller;


import edu.sabanciuniv.ozdensayalanhw4.model.Student;
import edu.sabanciuniv.ozdensayalanhw4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    // Dependency Injection
    // IoC --> Inversion of Controller
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student Student){
        return studentService.addNewStudent(Student);
    }

    @PutMapping("/students")
    public Student updateExistingStudent(@RequestBody Student Student){
        return studentService.updateExistingStudent(Student);
    }

    @DeleteMapping("/students")
    public void deleteExistingStudent(@RequestBody Student Student){
        studentService.deleteExistingStudent(Student);
    }
}
