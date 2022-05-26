package com.access;

enum Fruit
{
    Apple (10), Mango (9), Pineapple (12), Banana (15), Orange (8);
    private int weight;
    //Constructor
    Fruit (int w)
    {
        weight = w;
    }
    int getPrice ()
    {
        return weight;
    }
}
public class EnumDemo2
{
    public static void main (String[]args)
    {
        Fruit fr;
        // Display price of Mango
        System.out.println ("Mango costs: " + Fruit.Mango.getPrice () + "cents. \n");
        //Display all fruits and prices
        System.out.println ("All fruits prices:");
        for (Fruit f:Fruit.values ())
            System.out.println (f + " costs " + f.getPrice () + " cents. ");
    }
}