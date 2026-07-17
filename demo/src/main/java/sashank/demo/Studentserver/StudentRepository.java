package sashank.demo.Studentserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

//    public Student Informationsave(Student student) {
//        System.out.println("StudentRepository InformationSave called");
//        return student;
//    }


}
