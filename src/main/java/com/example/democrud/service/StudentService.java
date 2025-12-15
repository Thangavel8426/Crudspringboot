package com.example.democrud.service;

import com.example.democrud.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class StudentService {
    List<Student> s= new ArrayList<>(Arrays.asList(new Student(2,"Deva","java"), new Student(3,"Danush","python"),new Student(4,"Dhanvanth","mysql")));


    public List<Student> giveStudent() {
        return s;
    }

    public Student getStudentRollno(int rollno) {
        int index=0;
        for(int i=0;i<s.size();i++){
            if(s.get(i).getRollno()==rollno){
                index=i;
                break;
            }
        }
        return s.get(index);
    }

    public String setStudent(Student stu) {

    s.add(stu);
    return "succeess";

    }
}
