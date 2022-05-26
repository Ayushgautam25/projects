package threadingLearn;
public class Threading1 extends Thread{
	public void run() {
		System.out.println("Thread is working properly...");
	}
	public static void main(String[] args) {
		Threading1 d1 = new Threading1();
		d1.start();
	}
}
