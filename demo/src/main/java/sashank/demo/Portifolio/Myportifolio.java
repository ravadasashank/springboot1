package sashank.demo.Portifolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myportifolio {
    @GetMapping("/myself")
    public String Myself(){
        return """
                <h1>Myself</h1>
                <p>I am Ravada Sashank, I am a cloud and security Enthusiast </p>
                <ul>
                    <li>Github: https://github.com/ravadasashank</li>
                    <li>Linkdin: https://linkedin.com/in/ravadasashank444/</li>
                
                </ul>""";
    }
    @GetMapping("/skills")
    public String Skills(){
        return """
                <h1>Skills:</h1>
                <p>I have cloud and security skills</p>
                <ul>
                    <li>AWS<li>
                    <li>Cloud Security</li>
                    <li>Cloud Software</li>
                    <li>Vulnerability Aversion</li>
                    <li>IAM Security</li>
                    <li>Blockchain</li>
                    <li>Blockchain Security</li>
                    <li>Smart Contract Security</li>
                
                </ul>""";
    }
    @GetMapping("/education")
    public String Education(){
        return """
                <h1>Education:</h1>
                <p>I am studying Btech CSE in third year</p>
                """;
    }
    @GetMapping("/projects")
    public String Project(){
        return """
                <h1>Projects:</h1>
                <p> I created a cloud project which helps to keep track of attendence in cloud with high relilability
               .""";
    }
}
