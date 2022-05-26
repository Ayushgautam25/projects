package Astring;

import java.util.Scanner;

public class LowercaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("The Lowercases in the string are follows");
		for(int i=0;i<s.length();i++)
		{
			int j=(int)s.charAt(i);
			if((j>=97)&&(j<=122))
			{
				System.out.println(s.charAt(i));
			}
		}
		sc.close();
	}

}