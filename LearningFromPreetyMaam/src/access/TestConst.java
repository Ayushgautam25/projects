package com.access;


//java.lang.Enum 


	  enum Color2{
		RED,
		GREEN;
		
		private Color2()
		{
			System.out.println("Contructor called" + this.toString());
		}
		public void dispay()
		{
			System.out.println("displaying...");
		}
	  }
		class TestConst{
		public static void main(String[] args) {
			Color2 c = Color2.GREEN;
			c.dispay();
			System.out.println(c);
			
		}
		}
	


