package com.access;
// java.lang.Enum 


	  enum Color1{
		RED,
		GREEN;
		
		private Color1()
		{
			System.out.println("Contructor called" + this.toString());
		}
		public void dispay()
		{
			System.out.println("displaying...");
		}
	  }
		class TestConst1{
		public static void main(String[] args) {
			Color1 c = Color1.GREEN;
			System.out.println(c);
			c.dispay();
		}
		}
	


