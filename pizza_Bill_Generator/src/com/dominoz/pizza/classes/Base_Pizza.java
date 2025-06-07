package com.dominoz.pizza.classes;

import com.dominoz.pizza.methods.Addon;
import com.dominoz.pizza.methods.NonVegPizza;
import com.dominoz.pizza.methods.VegPizza;

public class Base_Pizza implements Addon,NonVegPizza,VegPizza
{
	

	@Override
	public int vegPizzaCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int NonVegPizzaCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cheeseCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int topping() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int takeAway() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dinning() {
		// TODO Auto-generated method stub
		return 0;
	}

}
