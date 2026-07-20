package sashank.demo.Studentserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import sashank.demo.Studentserver.Entity.Student;
import sashank.demo.Studentserver.Service.StudentService;
import org.springframework.web.bind.annotation.*;
import sashank.demo.dto.StudentRequestDTO;

@RestController
public class StudentController {

    StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @CrossOrigin
    @PostMapping("/create")
    public String StoreStudent(@RequestBody StudentRequestDTO studentRequestDTO){
//
        return studentService.studentvalidate(studentRequestDTO);


//        if(result==null){
//            return ResponseEntity.status(400).body(result);
//        }
//        return ResponseEntity.status(201).body(result);

    }

    @GetMapping("/get")
    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        Student student=studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        Student updatedStudent=studentService.updateStudent(student);
        return ResponseEntity.status(200).body(updatedStudent);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return ResponseEntity.status(200).body("Student deleted Successfully");
    }


}
