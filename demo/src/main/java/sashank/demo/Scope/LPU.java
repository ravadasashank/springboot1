package sashank.demo.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sashank.demo.Studentserver.Entity.Student;
    @Component
    @Scope("prototype")
    public class LPU {
        LPU(){
            System.out.println("LPU rank 100");
        }
        public void admission(Student student) {
            System.out.println("admission");
        }

        public void exam(){
            System.out.println("exam");
        }

        public void preClasses(Student student){
            System.out.println("preClasses");
        }
    }

