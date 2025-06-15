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
		if(obj.dinning==1)
		{
			System.out.println("Dinnig :"+obj.dinning());
		}
		else if(obj.dinning==2)
		{
			System.out.println(" Reservation :"+obj.dinning());
		}
		else
		{
			System.out.println(" Take Away :"+obj.dinning());
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
		
		if(obj.dinning==1)
		{
			System.out.println("Dinnig :"+obj.dinning());
		}
		else if(obj.dinning==2)
		{
			System.out.println(" Reservation :"+obj.dinning());
		}
		else
		{
			System.out.println(" Take Away :"+obj.dinning());
		}
		System.out.println("Total Bill :"+obj.total());
		
	}

}
