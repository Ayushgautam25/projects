package inheritenceDemo;
class Parent1
{
	void display()
	{
		System.out.println("Display");
	}
}
interface Parent2
{
	default void show()
	{
		System.out.println("Show");
	}
	void display();
}

public class MultipleInheritenceDemo extends Parent1 implements Parent2{
	public static void main(String[] args) {
		MultipleInheritenceDemo obj = new MultipleInheritenceDemo();
		obj.display();
//		obj.show();
	}
	@Override
	 public void display()
	 {
	   System.out.println("Displaying...");
	 }
	 
}
