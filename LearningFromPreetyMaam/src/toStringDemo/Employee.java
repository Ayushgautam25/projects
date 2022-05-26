package toStringDemo;

public class Employee {
	
	private String message;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Employee [message=" + message + "]";
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setMessage("Welcome to java classes");
		emp.getMessage();
		System.out.println(emp);
	}

}