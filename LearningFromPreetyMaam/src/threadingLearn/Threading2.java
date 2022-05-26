package threadingLearn;

public class Threading2 implements Runnable {
	public void run() {
		System.out.println("Thread is running properly");
	}
	public static void main(String[] args) {
		Threading2 t1 = new Threading2();
		Thread t2 = new Thread(t1);
		t2.start();
	}
}
