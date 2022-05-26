package exception;

public class ExceptionHandelingDemo {
	public static void main(String[] args){
		int a = 10;
		int b = 0;
		try {
//		if(b==0) {
//			System.out.println("B value equal to zero throws an Arithmetic Exception");
//		}
//		else {
//		int c = a/b;
//		System.out.println(c);
//		}
			int c = a/b;
//			System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception Occured");
			System.out.println("Printing Stack Trace");
			ae.printStackTrace();+
			System.out.println("Printing toString");
			System.out.println(ae.toString());
			System.out.println("Getting Message");
			System.out.println(ae.getMessage());
		}
		catch(Exception e) {
			System.out.println("Any other exception occured!");
			System.exit(0);
		}
		finally{
			System.out.println("Execution Completed");
		}
	}
}
