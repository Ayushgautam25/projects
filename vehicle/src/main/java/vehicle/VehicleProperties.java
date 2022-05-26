package vehicle;

import org.springframework.beans.factory.annotation.Autowired;

public class VehicleProperties {
	private String Engine;
	private int gear;
	@Autowired
	private Fuel f;
	public VehicleProperties() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Engine= " + Engine + "\n" +" Gear = " + gear + "\n" + f;
	}

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public Fuel getF() {
		return f;
	}

	public void setF(Fuel f) {
		this.f = f;
	}

	public VehicleProperties(String engine, int gear, Fuel f) {
		super();
		Engine = engine;
		this.gear = gear;
		this.f = f;
	}

	public void inititit() {
		System.out.println("Information of car :");
	}
	public void byebye() {
		System.out.println("Bye Bye!");
	}
}
