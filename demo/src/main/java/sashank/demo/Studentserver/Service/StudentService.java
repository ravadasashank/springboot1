package sashank.demo.Studentserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sashank.demo.Studentserver.Repository.StudentRepository;
import sashank.demo.Studentserver.Entity.Student;
import sashank.demo.dto.StudentRequestDTO;
import sashank.demo.dto.StudentResponseDTO;

import java.time.LocalDateTime;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentResponseDTO studentValidate(StudentRequestDTO studentRequestDTO) {


//        int id = student.getId();
//        String name = student.getName();
//        String dept = student.getDept();
//        int age = student.getAge();
//
//        if(id<0 || name==null || age<0 || dept==null){
//            return null;
//        }

//       studentRepository.save(student);
//
//
//        return "Data Saved";
        Student student = mapToStudent(studentRequestDTO);
        return mapToResponseDTO(student);
    }


    public Student getStudentById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student deleteStudent(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    private Student mapToStudent(StudentRequestDTO createStudentRequestDTO) {
        Student student = new Student();

        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDept(createStudentRequestDTO.getDept());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

    public StudentResponseDTO mapToResponseDTO(Student student) {
        StudentResponseDTO createStudentResponseDTO = new StudentResponseDTO();
        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setDept(student.getDept());

        return createStudentResponseDTO;
    }
}
