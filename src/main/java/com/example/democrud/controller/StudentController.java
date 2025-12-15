package com.example.democrud.controller;

import com.example.democrud.model.Student;
import com.example.democrud.service.StudentService;
import lombok.extern.flogger.Flogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
