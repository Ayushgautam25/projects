package enumerators;
import java.lang.*;


enum Footballers{
	Messi, Ronaldo, Beckham, Maradona, Pele;
}
public class Footballers{
public static void main(String[] args) {
	Footballers var = Footballers.Messi;
	switch(var) {
		case Messi:
			System.out.println("Messi is an argentinian footballer");
			break;
		case Ronaldo:
			System.out.println("Ronaldo is a Portugese footballer");
			break;
		case Beckham:
			System.out.println("Beckham is a legendary footballer");
			break;
		case Maradona:
			System.out.println("Maradona is an argentinian footballer");
			break;
		case Pele:
			System.out.println("Pele is a brazilian footballer");
			break;
	}
}
}
