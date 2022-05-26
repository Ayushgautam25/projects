package threadingLearn;

class MovieApp
{
	int total_seats = 10;
	synchronized void bookSeats(int seats)
	{ // 10>=6
	  if(total_seats>=seats)
	  {
	  System.out.println(seats + "Seats booked successfully"); 
	  total_seats= total_seats-seats;
	  System.out.println("seats left: " +total_seats);
	  }
	  else
	  {
		  System.out.println("Seats Not booked");
	   System.out.println("seats available" +total_seats);
	  }
	}
}
public class MovieAppThread extends Thread {

	 static MovieApp m;
	 int seats;
	 public void run()
	 { 
		 m.bookSeats(seats);
	 }
	 public static void main(String[] args) {
		
		 m = new MovieApp();
		 MovieAppThread user1 = new MovieAppThread();
		 user1.seats = 11;
		 user1.start();
		 MovieAppThread user2 = new MovieAppThread();
		 user2.seats = 6;
		 user2.start();
		 
		 
	}
}