package vehicle;

public class Fuel {
	private String Petrol;

	public Fuel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fuel(String petrol) {
		super();
		Petrol = petrol;
	}

	public String getPetrol() {
		return Petrol;
	}

	public void setPetrol(String petrol) {
		Petrol = petrol;
	}

	@Override
	public String toString() {
		return "Fuel = "+Petrol;
	}
	
}
