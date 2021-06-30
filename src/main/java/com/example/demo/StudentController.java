package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class StudentController {
     List<Student> students = new ArrayList<Student>();

    public StudentController() {
        String[] interests = {"Skiing", "Holidays"};
        Student john = new Student("John", "Doe", 34, "London", interests, 0);
        Student alex = new Student("Alex", "Doe", 35, "London", interests, 1);
        Student will = new Student("Will", "Doe", 36, "London", interests, 2);
        Student may = new Student("May", "Doe", 37, "London", interests, 3);
        Student shruti = new Student("Shruti", "Battu", 38, "London", interests, 4);
        Student clint = new Student("Clint", "Doe", 39, "London", interests, 5);
        students.add(john);
        students.add(alex);
        students.add(will);
        students.add(may);
        students.add(shruti);
        students.add(clint);

    }
    @GetMapping("/students")
    //get students
   public List<Student>getStudents() {
       return this.students;
   }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable ("id") int id) {
        return this.students.get(id);
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        System.out.println("the name is " + student.getFirstName());
        this.students.add(student);
        return student;
    }

    //get single student by id
    public Student getStudent(String id) {
       return this.students.get(0);
    }
    //delete a student by id as well
}
