package overridingdemo;
class Surname{
	void surname() {
		System.out.println("Surname is unknown.");
	}
}
public class Name extends Surname{
	
	//@Override
	void surname() {
		System.out.println("My Surname is Gautam");
	}
	void name() {
		System.out.println("My Name is Ayush");
	}
	public static void main(String[] args) {
		Name n1 = new Name();
		n1.name();
		n1.surname();
	}
}
