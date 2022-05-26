package com.access;
// default, public,protected,private
 public class PubPrivateDemo
 {
	  public int add(int a,int b)
	 {
		 int c=a+b;
		 System.out.println(c);
		 return c;
	 }
	  public static void main(String[] args) {
		  PubPrivateDemo p1 = new PubPrivateDemo();
			p1.add(10,10);
		}
 }
 
	


