package inheritenceDemo;
import java.util.Scanner;

class RBI {
	void rules() {
		System.out.println("Bank should provide its services properly.");
	}
}

public class Banks extends RBI {
	void PublicBanks() {
		System.out.println("Public Banks provides services to all the clients");
	}

	void PrivateBanks() {
		System.out.println("Private Banks provides services to priority clients");
	}

	static class SBI extends Banks {
		void roi() {
			Banks b1 = new Banks();
			b1.PrivateBanks();
			int roi = 3;
			System.out.println("Current Rate of Interest is " + roi + "%.");
			System.out.println("Enter Time period:");
			Scanner sc = new Scanner(System.in);
			int time = sc.nextInt();
			System.out.println("Enter Amount");
			int amt = sc.nextInt();
			sc.close();
			int si = (roi * time * amt) / 100;
			int amount = si + amt;
			System.out.println("Total Interest = " + si);
			System.out.println("Total Amount = " + amount);
		}
	}

	public static void main(String[] args) {
		SBI c1 = new SBI();
		c1.rules();
		c1.roi();
	}
}