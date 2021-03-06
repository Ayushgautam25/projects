package vehicle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
	public static void main(String[] args) {
		AbstractApplicationContext Carsss = new ClassPathXmlApplicationContext("beans.xml");
		VehicleProperties Audi = (VehicleProperties) Carsss.getBean("Car");
		System.out.println("Audi Properties : \n" +Audi+"\n");
		Carsss.registerShutdownHook();
		
		AbstractApplicationContext Carss = new ClassPathXmlApplicationContext("beans1.xml");
		VehicleProperties BMW = (VehicleProperties) Carss.getBean("Car1");
		System.out.println("BMW : \n"+BMW);
		Carss.registerShutdownHook();
	}
}
