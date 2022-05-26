package interfaceDemo;

interface I1{
	void display1();
}

interface I2{
	void display2();
}
public class InterfaceDemo implements I1,I2 {
	@Override
	public void display1() {
		System.out.print("Ayush ");
	}
	@Override
	public void display2(){
		System.out.println("Gautam");
	}
	public static void main(String[] args) {
		
		InterfaceDemo D1 = new InterfaceDemo();
		D1.display1();
		D1.display2();
	}

}
