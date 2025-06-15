package com.dominoz.pizza.classes;

public class ShowDetails {
	public void showDetails(Base_Pizza obj)
	{
		System.out.println("Number of Veg Pizza "+obj.vegPizza+" Total vegPizza Cost: "+obj.vegPizzaCost());
		System.out.println("Number of Non Veg Pizza "+obj.nonVegPizza+" Total non vegPizza Cost: "+obj.NonVegPizzaCost());
		System.out.println("Number of cheeese "+obj.cheese+" Total cheese Cost: "+obj.cheeseCost());
		if(obj.topping==1)
		{
			System.out.println("@Topping per pizza is Rs-20");
			System.out.println("Total number of Pizza:"+(obj.vegPizza+obj.nonVegPizza)+ "Total topping cost: "+obj.topping());
		}
		System.out.println("Total Bill :"+obj.total());
	}
	public void showDetails(Deluxe_Pizza obj)
	{
		System.out.println("For deluxe order 1 cheese is free");
		System.out.println("Number of Veg Pizza "+obj.vegPizza+" Total vegPizza Cost: "+obj.vegPizzaCost());
		System.out.println("Number of Non Veg Pizza "+obj.nonVegPizza+" Total non vegPizza Cost: "+obj.NonVegPizzaCost());
		System.out.println("Number of cheeese "+(obj.cheese+1)+" Total cheese Cost: "+obj.cheeseCost());
		if(obj.topping==1)
		{
			System.out.println("Topping is free for each pizza");
		}
		System.out.println("Total Bill :"+obj.total());
		
	}

}
