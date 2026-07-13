package sashank.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sashank.demo.DependencyInjection.OrderService;
import sashank.demo.Notification.Creditcard;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Student student=context.getBean(Student.class);
//		student.setName("Sashank");
//		student.setAge(30);
//		System.out.println(student.getName());
//		System.out.println(student.getAge());
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeorder();
	}

}
