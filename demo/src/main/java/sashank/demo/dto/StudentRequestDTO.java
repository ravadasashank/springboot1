package sashank.demo.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StudentRequestDTO {
    String name;
    String dept;
    int age;
}
