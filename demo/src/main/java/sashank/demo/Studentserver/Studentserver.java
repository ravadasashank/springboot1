package sashank.demo.Studentserver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentserver {
    //1. Store the Student Details -- POST
    @PostMapping("/create")
    public String StoreStudent(){
        return """
                id: 1
                Name: Sashank
                Dept: CSE
                age: 21
                """;
    }

    //2. Read the Details -- GET


    //3. Update the Details -- PUT/PATCH


    //4.Delete the Detalis -- DELETE
}
