package sashank.demo.Studentserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
        StudentRepository studentRepository;
        @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student studentvalidate(Student student) {


        int id = student.getId();
        String name = student.getName();
        String dept = student.getDept();
        int age = student.getAge();

        if(id<0 || name==null || age<0 || dept==null){
            return null;
        }

       studentRepository.save(student);


        return student;
    }
}
