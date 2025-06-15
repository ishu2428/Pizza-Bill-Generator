package com.dominoz.pizza.classes;

import com.dominoz.pizza.methods.Addon;
import com.dominoz.pizza.methods.NonVegPizza;
import com.dominoz.pizza.methods.VegPizza;

public class Base_Pizza implements Addon,NonVegPizza,VegPizza
{
	public int vegPizza;
	public int nonVegPizza;
	public int cheese;
	public int topping;
	public Base_Pizza(int vegPizza,int nonVegPizza,int cheese,int topping)
	{
		this.vegPizza=vegPizza;
		this.nonVegPizza=nonVegPizza;
		this.cheese=cheese;
		this.topping=topping;
	}
	

	@Override
	public int vegPizzaCost() {
		int total=vegPizza*300;
		return total;
	}

	@Override
	public int NonVegPizzaCost() {
		int total=nonVegPizza*400;
		return total;
	}

	@Override
	public int cheeseCost() {
		int total=cheese*100;
		return total;
	}

	@Override
	public int topping() 
	{
		
		int totalPizza=vegPizza+nonVegPizza;
		
		return (20*totalPizza);
	}

	@Override
	public int takeAway() {
		
		return 20;
	}

	@Override
	public int dinning() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int total()
	{
		int total=vegPizzaCost()+NonVegPizzaCost()+cheeseCost();
		if(topping==1)
		{
			total=total+topping();
		}
		return total;
	}


}
