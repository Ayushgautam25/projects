package enumtest;
import java.util.Scanner;
enum test1{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumTest {
	test1 test;
	public EnumTest(test1 test) {
		this.test = test;
	}
	public void ListofDays() {
		switch(test) {
			case MONDAY:
				System.out.println("MONDAY is very bad");
				break;
			case TUESDAY:
				System.out.println("Tuesday is okayish");
				break;
			case WEDNESDAY:
				System.out.println("Wednesday is okay");
				break;
			case THURSDAY:
				System.out.println("Thursday is good");
				break;
			case FRIDAY:
				System.out.println("Friday is very good");
				break;
			case SATURDAY:
				System.out.println("Saturday is best");
				break;
			case SUNDAY:
				System.out.println("Sunday is chill");
				break;
			default:
				System.out.println("Nothing..");
				break;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter day in capitals");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		EnumTest t1 = new EnumTest(test1.valueOf(str));
		t1.ListofDays();
		
	}

}
