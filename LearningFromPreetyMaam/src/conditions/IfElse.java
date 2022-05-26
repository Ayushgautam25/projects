package conditions;

public class IfElse {
	public static void main(String[] args) {
		int a = 10;
		int age = 20;
		String country = "India";
		//1st 
		if(a==10) {
			System.out.println("This is an example of if Statement");
		}
		
		//2nd
		if(a==20) {
			System.out.println("This is an example of if else statement");
		}
		else {
			System.out.println("This is an example of if else statement");
		}
		
		//3rd
		
		if(a==5) {
			System.out.println("This is an example of if else ladder");
		}
		else if(a==10) {
			System.out.println("This is an example of if else ladder");
		}
		else {
			System.out.println("This is an example of if else ladder");
		}
		
		//4th
		System.out.println("Your Age : "+age);
		if(country=="India") {
			if(age>18){
				System.out.println("You are eligible to cast vote");
			}
			else if(age == 18) {
				System.out.println("You are eligible to cast vote");
			}
			else {
				System.out.println("You cannot vote");
			}
		}
		else {
			System.out.println("You are not an indian, so you cannot vote");
		}
	}
}
