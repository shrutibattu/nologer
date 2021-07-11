package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class CourseController {

    @Autowired
    private CourseService courseService;

//    public CourseController(List<Course> students) {
//        Course webdev = new Course("cz1pqr", "Web Dev 101");
//        Course Database = new Course("dat12q", "database 101");
//        Course Java = new Course("java321", "java 101");
//        this.courses.add(webdev);
//        this.courses.add(Database);
//        this.courses.add(Java);
//    }

//    @GetMapping("/courses")
//    public List<Course> getCourses() {
//        return this.courses;
//    }




    @GetMapping("/courses")
    public ResponseEntity<?> getCourses() {
        List<Course> course = courseService.getCourses();
        return  ResponseEntity.status(HttpStatus.OK).body(course);
    }
}



//    @GetMapping("/courses/{courseId}")
//    public Course getCourse(@PathVariable String courseId) {
//        Course courseToFind;
//        for (Course course : this.courses) {
//            if (courseId.equals(course.getCourseId())) {
//                return course;
//            }
//        }
//        return null;
//    }



//    @GetMapping("/courses/{courseId}")
//    public ResponseEntity getCourse(@PathVariable String courseId) {
//        Course courseToFind;
//        for (Course course : this.courses) {
//            if (courseId.equals(course.getCourseId())) {
//                return new ResponseEntity(course, HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity(null, HttpStatus.NOT_FOUND);
//    }

//    @DeleteMapping("/courses/{courseId}")
//    public String deleteCourse(@PathVariable String courseId) {
//        for (Course course : courses) {
//            if (course.getCourseId().equals(courseId)) {
//                this.courses.remove(course);
//            }
//
//        }
//        return null;
//    }
//}
//    @DeleteMapping("/courses/{courseId}")
//    public ResponseEntity deleteCourse(@PathVariable String courseId) {
//        for (Course course : courses) {
//            if (course.getCourseId().equals(courseId)) {
//                this.courses.remove(course);
//
//                return new ResponseEntity("success, removed course", HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity("could not find course" + courseId, HttpStatus.NOT_FOUND);
//    }
//}