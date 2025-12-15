package com.example.democrud.service;

import com.example.democrud.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class StudentService {
    List<Student> s= new ArrayList<>(Arrays.asList(new Student(2,"Deva","java"), new Student(3,"Danush","python")));


    public List<Student> giveStudent() {
        return s;
    }
}
