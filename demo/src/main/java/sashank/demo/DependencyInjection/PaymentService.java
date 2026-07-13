package sashank.demo.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void paymentdone(){
        System.out.println("payment done");
    }
}
