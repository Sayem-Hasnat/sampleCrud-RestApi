package com.synesisit.SampleCrud.controller;

import com.synesisit.SampleCrud.entity.Student;
import com.synesisit.SampleCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable String studentId) {
        studentService.delete(Long.parseLong(studentId));
        return "Deleted";
    }

    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable("studentId") Long studentId, @RequestBody Student studentRequest) {
        return studentService.update(studentId, studentRequest);

    }
}
