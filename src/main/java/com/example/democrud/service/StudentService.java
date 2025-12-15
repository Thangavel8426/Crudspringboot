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

    public String upateStudent(Student stu) {

        int index=0;
        boolean found=false;
        for(int i=0;i<s.size();i++){
            if(s.get(i).getRollno()== stu.getRollno()){
                index=i;
                found = true;
                break;
            }
        }
         if(found) {s.set(index,stu);
         return "updated sucesfully";}
         else {
             return "No such student found";

         }



    }

    public String deleteStudent(int rollno) {
        int index=0;
        boolean found=false;
        for(int i=0;i<s.size();i++){
            if(s.get(i).getRollno()== rollno){
                index=i;
                found = true;
                break;
            }
        }
        if(found){
            s.remove(index);
            return "Deleted Succesfully";

        }
        else{
            return "No Such object";
        }

    }
}
