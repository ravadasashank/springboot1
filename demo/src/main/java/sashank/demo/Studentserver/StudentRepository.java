package sashank.demo.Studentserver;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student Informationsave(Student student) {
        System.out.println("StudentRepository InformationSave called");
        return student;
    }
}
