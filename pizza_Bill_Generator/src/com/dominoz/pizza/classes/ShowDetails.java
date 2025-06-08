package com.dominoz.pizza.classes;

public class ShowDetails {
	public void showDetails(Base_Pizza obj)
	{
		System.out.println("Number of Veg Pizza "+obj.vegPizza+" Total vegPizza Cost: "+obj.vegPizzaCost());
		System.out.println("Number of Non Veg Pizza "+obj.nonVegPizza+" Total non vegPizza Cost: "+obj.NonVegPizzaCost());
		System.out.println("Number of cheeese "+obj.cheese+" Total cheese Cost: "+obj.cheeseCost());
		System.out.println("Total Bill :"+obj.total());
	}
	public void showDetails(Deluxe_Pizza obj)
	{
		System.out.println("For deluxe order 1 cheese is free");
		System.out.println("Number of Veg Pizza "+obj.vegPizza+" Total vegPizza Cost: "+obj.vegPizzaCost());
		System.out.println("Number of Non Veg Pizza "+obj.nonVegPizza+" Total non vegPizza Cost: "+obj.NonVegPizzaCost());
		System.out.println("Number of cheeese "+(obj.cheese+1)+" Total cheese Cost: "+obj.cheeseCost());
		System.out.println("Total Bill :"+obj.total());
		
	}

}
