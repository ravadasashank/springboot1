package sashank.demo.Studentserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import sashank.demo.Studentserver.Entity.Student;
import sashank.demo.Studentserver.Service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> StoreStudent(@RequestBody Student student){
//
        Student result=studentService.studentvalidate(student);


        if(result==null){
            return ResponseEntity.status(400).body(result);
        }
        return ResponseEntity.status(201).body(result);

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        Student student=studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }

}
