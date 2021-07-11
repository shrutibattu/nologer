package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> fetchAllStudents() {
        return studentRepository.findAll();

    }
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}