package com.access;
// enums are always public static final
enum Day
{
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY
}

public class TestEnum {
 
	Day day;
	public TestEnum(Day day)
	{
		this.day =  day;
	}
	public void listofdays()
	{
		switch(day)
		{
		case MONDAY:
			System.out.println("Monday is so lazy");
		
		break;
		case FRIDAY:
		System.out.println("Friday is fun");
	 
		break;
		
		case THURSDAY:
		System.out.println("Monday is so sleepy");
	   break;
	   default:
		   System.out.println("Nothing...");
		   break;

	}
}
	public static void main(String[] args) {
		String text = "SUNDAY";
		TestEnum t1 = new TestEnum(Day.valueOf(text));
		t1.listofdays();
	}
}