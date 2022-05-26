package com.collections;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Elements{
	private Integer atomic_number;
	private String Element;
	private String Symbols;
	Elements(Integer atomic_number, String Element, String Symbols){
		this.atomic_number = atomic_number;
		this.Element = Element;
		this.Symbols = Symbols;
	}
	public Integer getAtomic_number() {
		return atomic_number;
	}
	public void setAtomic_number(Integer atomic_number) {
		this.atomic_number = atomic_number;
	}
	public String getElement() {
		return Element;
	}
	public void setElement(String element) {
		Element = element;
	}
	public String getSymbols() {
		return Symbols;
	}
	public void setSymbols(String symbols) {
		Symbols = symbols;
	}
	@Override 
	public String toString(){
		return atomic_number+ " "+Element +" "+Symbols; 
	}
}
public class Managment {
	public static void main(String[] args) {
		Map<Integer, Elements> periodictable = new TreeMap<>();
		periodictable.put(1, new Elements(1, "Hydrogen","H"));
		periodictable.put(2, new Elements(2, "Helium", "He"));
		periodictable.put(3, new Elements(3, "Lithium", "Li"));
		periodictable.put(4, new Elements(4, "Beryllium", "Be"));
		periodictable.put(5, new Elements(5, "Boron", "B"));
		periodictable.put(6, new Elements(6, "Carbon", "C"));
		periodictable.put(7, new Elements(7, "Nitrogen", "N"));
		periodictable.put(8, new Elements(8, "Oxygen", "O"));
		periodictable.put(9, new Elements(9, "Fluorine", "F"));
		periodictable.put(10, new Elements(10, "Neon", "Ne"));
		periodictable.put(11, new Elements(11, "Sodium", "Na"));
		periodictable.put(12, new Elements(12, "Magnesium", "Mg"));
		periodictable.put(13, new Elements(13, "Aluminium", "Al"));
		
		
		System.out.println("Periodic Table : "+periodictable+"\n");
		
		try {
		Scanner sc = new Scanner(System.in);
		boolean w = false;
		do{
		System.out.println("Enter entry for the following menu : ");
		System.out.println("1 -> Print current Table");
		System.out.println("2 -> Enter a new Element");
		System.out.println("3 -> Search for a particular atomic number");
		System.out.println("4 -> Enter an element in table");
		System.out.println("5 -> Exit");
		int i = sc.nextInt();
		switch(i) {
		case 1:{
			System.out.println(periodictable);
			break;
		}
		case 2:{
			System.out.println("Enter the atomic number of element : ");
			int at = sc.nextInt();
			System.out.println("Enter the element name : ");
			String s = sc.next();
			System.out.println("Enter the element symbol : ");
			String ss = sc.next();
			periodictable.put(at, new Elements(at, s, ss));
			for(int j=1; j<=periodictable.entrySet().size(); j++) {
				System.out.println(periodictable.get(j));
			}
			break;
		}
		case 3:{
			System.out.println("Enter the atomic number : ");
			int atc = sc.nextInt();
			if(periodictable.containsKey(atc)){
				System.out.println("Entered atomic number is present in the table.");
				System.out.println(periodictable.get(atc));
			}
			else {
				System.out.println("Do you want to add element for that position : ");
				String sss = sc.next();
				if(sss=="Yes"||sss=="yes") {
					System.out.println("Enter the Atomic Name : ");
					String l = sc.next();
					System.out.println("Enter the atomic symbol : ");
					String pe = sc.next();
					periodictable.put(atc, new Elements(atc, l, pe));
				}
			}
			break;
		}
		case 4:{
			System.out.println("Enter the atomic number : ");
			int atmn = sc.nextInt();
			System.out.println("Enter the atomic name : ");
			String sct = sc.next();
			System.out.println("Enter the atomic symbol : ");
			String stc = sc.next();
			periodictable.putIfAbsent(atmn, new Elements(atmn, sct, stc));
			System.out.println(periodictable);
			break;
			}
		case 5: {
			System.out.println("Exiting...");
			System.exit(0);
		}
		default:
			System.out.println(periodictable);
			break;

		}
		System.out.println("Do you want to do any operations : ");
		w = sc.nextBoolean();
		}while(w==true);
		sc.close();
		}
		catch(InputMismatchException thre) {
			System.out.println("Input Mismatch Exception occured.");
//			thre.getMessage();
		}
	}
}