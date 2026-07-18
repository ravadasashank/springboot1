package sashank.demo.Studentserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sashank.demo.Studentserver.Entity.Student;


public interface StudentRepository extends JpaRepository<Student,Integer> {

//    public Student Informationsave(Student student) {
//        System.out.println("StudentRepository InformationSave called");
//        return student;
//    }


}
