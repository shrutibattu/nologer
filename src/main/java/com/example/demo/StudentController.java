package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


//    public StudentController() {
//        String[] interests = {"Skiing", "Holidays"};
//        Student john = new Student("John", "Doe", 34, "London", interests, 0);
//        Student alex = new Student("Alex", "Doe", 35, "London", interests, 1);
//        Student will = new Student("Will", "Doe", 36, "London", interests, 2);
//        Student may = new Student("May", "Doe", 37, "London", interests, 3);
//        Student shruti = new Student("Shruti", "Battu", 38, "London", interests, 4);
//        Student clint = new Student("Clint", "Doe", 39, "London", interests, 5);
//        students.add(john);
//        students.add(alex);
//        students.add(will);
//        students.add(may);
//        students.add(shruti);
//        students.add(clint);}


    @GetMapping("/students")
    //get students
    public ResponseEntity<?> fetchAllStudents() {
        List<Student> students = studentService.fetchAllStudents();
        return ResponseEntity.status(HttpStatus.OK).body(students);


   }

//    @GetMapping("/student/{studentId}")
//    public ResponseEntity getStudent(@PathVariable String studentId) {
//        List<Student> studenttoFind = studentService.getStudent();
//
//
//        for (Student student : this.student) {
//            if (studentId.equals(student.getStudentId())) {
//                return new ResponseEntity(student, HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity(null, HttpStatus.NOT_FOUND);
//    }
//
//        return
//
//    }





    @PostMapping("/student")

    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        studentService.addStudent(student);

        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    //get single student by id
//    public Student getStudent(String id) {
//       return this.students.get(0);
//    }
    //delete a student by id as well
}
