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
	public int dinning;
	public Base_Pizza(int vegPizza,int nonVegPizza,int cheese,int topping,int dinning)
	{
		this.vegPizza=vegPizza;
		this.nonVegPizza=nonVegPizza;
		this.cheese=cheese;
		this.topping=topping;
		this.dinning=dinning;
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
		if(cheese<0)
		{
			return 0;
		}
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
		if(dinning==1)
		{
			return 0;
		}
		else if(dinning==2)
		{
			return 50;
		}
		if(dinning==3)
		{
			return takeAway();
		}
		return 0;
	}
	
	public int total()
	{
		int total=vegPizzaCost()+NonVegPizzaCost()+cheeseCost()+dinning();
		if(topping==1)
		{
			total=total+topping();
		}
		return total;
	}


}
