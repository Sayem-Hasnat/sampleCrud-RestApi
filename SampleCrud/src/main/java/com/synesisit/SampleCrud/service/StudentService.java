package com.synesisit.SampleCrud.service;

import com.synesisit.SampleCrud.entity.Department;
import com.synesisit.SampleCrud.entity.Student;
import com.synesisit.SampleCrud.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService  {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student save(Student student) {

        return studentRepo.save(student);
    }


    public void delete(long parseLong) {
        Student student = studentRepo.getById(parseLong);
        studentRepo.delete(student);
    }

    public Student update(Long studentId, Student studentRequest) {
        Student student = studentRepo.findById(studentId).get();
        student.setStudentName(studentRequest.getStudentName());
        student.setStudentAge(studentRequest.getStudentAge());
        return studentRepo.save(student);

    }
}
