package loops;
public class loop {
	public static void main(String[] args) {
		/*
		int i=0,n=5;
		//for loop
		System.out.println("For");
		for(i=0; i<n; i++) {
			System.out.println(i);
		}
		//while loop
		System.out.println("while");
		while(i<n) {
			System.out.println(i);
		}
		
		//do while loop
		System.out.println("do while");
		do {
			System.out.println(i);
		}while(i<n);
			//enhanced for loop
		System.out.println("enhanced for");
		String a[]= {"a","b","c","d","e"};
		for (String s:a) {
			System.out.println(i);*/
		int n=10;
		for(int i=0; i<n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
