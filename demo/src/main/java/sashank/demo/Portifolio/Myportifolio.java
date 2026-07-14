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
                    <li>Github:https://github.com/ravadasashank</li>
                    <li>Linkdin:linkedin.com/in/ravadasashank444/</li>
                
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
    void Education(){
    }
    @GetMapping("/projects")
    void Project(){

    }
}
