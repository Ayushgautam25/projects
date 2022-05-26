package innerClassDemo;
class A{
	void fun1() {
		System.out.println("Printing outer class function");
	}
	class B{
		void fun2() {
			System.out.println("Printing inner class function");
		}
		class C{
			void fun3() {
				System.out.println("inner inner");
			}
		}
	}
}

interface I10{
	default void fun10() {
		System.out.println("print");
	}
//	interface I20{
//		default void fun11(){
//			System.out.println("display");
//		}
//	}
}

public class InnerClassDemo implements I10 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.fun1();
		A.B a2 = a1.new B();
		a2.fun2();
		A.B.C a3 = a2.new C();
		a3.fun3();
		InnerClassDemo f = new InnerClassDemo();
		f.fun10();
//		I10.I20 f1 = f.new I20();
//		f.fun11();
		
	}
}
