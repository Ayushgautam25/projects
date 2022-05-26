package polymorphismDemo;

class Grand{
	static void fun() {
		System.out.println("Beta Ji have fun");
	}
	void print() {
		System.out.println("Parent having fun");
	}
}

class Parent1 extends Grand{
	static void fun() {
		System.out.println("Yes Papa ji having fun");
	}
	@Override
	void print() {
		System.out.println("Child having fun");
	}
	void display() {
		System.out.println("Displaying....");
	}
}
public class PolyDemo extends Parent1{
	public static void main(String[] args) {
		Grand c1 = new Parent1();
		Parent1 c2 = new Parent1();
		c1.fun();
		c2.fun();
		c1.print();
		c2.display();

	}
}