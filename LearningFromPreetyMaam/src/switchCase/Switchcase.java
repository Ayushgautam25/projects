package switchCase;
import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favourite cricketers last name");
		String str = sc.nextLine();
		switch(str) {
		case "Kohli":
			System.out.println("Virat Kohli");
			break;

		case "Dhoni":
			System.out.println("Mahendra singh Dhoni");
			break;
			
		case "Kishan":
			System.out.println("Ishan Kishan");
			break;
		}
	}

}
