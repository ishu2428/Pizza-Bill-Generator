package com.dominoz.pizza.classes;
import java.util.Scanner;

public class TotalBillGenerator {

	public static void main(String[] args)
	{
		Scanner so=new Scanner(System.in);
		System.out.println("would you like to order either Base Pizza or Deluxe Pizza");
		System.out.println("enter 1 for Base Pizza \n 2 for Deluxe Pizza");
		int order=so.nextInt();
		System.out.println("Enter the number of veg Pizza");
		int veg=so.nextInt();
		System.out.println("enter the number of non veg Pizza");
		int non_veg=so.nextInt();
		System.out.println("enter the number of cheese");
		int cheese=so.nextInt();
		if(order==1)
		{
			Base_Pizza base_pizza=new Base_Pizza(veg,non_veg,cheese);
			System.out.println("would you like to check your details");
			
			
		}
		else if(order==2)
		{
			Deluxe_Pizza deluxe_pizza=new Deluxe_Pizza(veg,non_veg,cheese);
			System.out.println("would you like to check your details");
		}
		else
		{
			System.out.println("invalid choice");
		}

	}

}
