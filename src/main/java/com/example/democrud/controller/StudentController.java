package com.example.democrud.controller;

import com.example.democrud.model.Student;
import com.example.democrud.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;

@RestController

public class StudentController {
    @Autowired
    StudentService sts;
    @GetMapping("/Students")
    public List<Student> getStudent(){
        return sts.giveStudent();



    }
    @GetMapping("/Students/{rollno}")
    public Student getStudentRollno(@PathVariable("rollno") int rollno){
        return sts.getStudentRollno(rollno) ;
    }
    @PostMapping("Students")
    public String setStudents(@RequestBody Student stu){
        return sts.setStudent(stu);
    }
    @PutMapping("Students")
    public String updateStudents(@RequestBody Student stu){
         return sts.upateStudent(stu);

    }
    @DeleteMapping("Students/{rollno}")
    public String deleteStudent(@PathVariable int rollno){
        return sts.deleteStudent(rollno);
    }

}
