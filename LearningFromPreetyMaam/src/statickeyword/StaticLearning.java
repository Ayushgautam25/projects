package statickeyword;
class Student
{
	int rollNumber;
	String name;
	static String collegename="JECRC University";
	static String cityname = "Jaipur";
	
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
   
	void display()
	{
		System.out.println(rollNumber+ " " +name+ " " +collegename+ " " +cityname);
	}
	
}
public class StaticLearning
{
	public static void main(String[] args) {
		Student s1 = new Student(101,"Yash");
		Student s2 = new Student(102,"Ayush");
		s1.display();
		s2.display();
}
}