package com.dominoz.pizza.classes;


public class Deluxe_Pizza extends Base_Pizza
{

	public Deluxe_Pizza(int vegPizza,int nonVegPizza,int cheese,int topping,int dinning)
	{
		super(vegPizza,nonVegPizza,cheese-1,topping,dinning);
	}
	public int vegPizzaCost() {
		int total=vegPizza*700;
		return total;
	}

	@Override
	public int NonVegPizzaCost() {
		int total=nonVegPizza*900;
		return total;
	}
	
	public int topping() 
	{
		
		
		return 0;
	}

	@Override
	public int takeAway() {
		
		return 20;
	}
	public int Total()
	{
		int total=vegPizzaCost()+NonVegPizzaCost()+cheeseCost()+dinning();
		if(topping==1)
		{
			total=total+topping();
		}
		return total;
	}

}
