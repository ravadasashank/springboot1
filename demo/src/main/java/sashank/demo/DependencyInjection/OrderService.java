package sashank.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    //@Autowired
    PaymentService paymentService;
/*
    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    */
    @Autowired
    public void setPaymentService (PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeorder(){
        paymentService.paymentdone();
        System.out.println("order placed");
    }
}
