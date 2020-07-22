package com.aipalbot.revison.programs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayExample {
	
	public void  calculateAmount()
	{
		
		String[] itemsNames = new String[4];
		int size = itemsNames.length;
		int[] itemsQuantity = new int[size];
		double[] itemsPrice = new double[size];
		double totalAmount = 0.0;
		
		for(int i=0; i<size; i++)
		{
			int header = i;
			System.out.println("********************Enter Item "+ (header+1) +" *********************");
			
			System.out.println("Enter Item Name: ");
			Scanner input1 = new Scanner(System.in);
			itemsNames[i] = input1.nextLine();
			
			System.out.println("Enter Item Price: ");
			Scanner input2 = new Scanner(System.in);
			itemsPrice[i] = input2.nextDouble();
			
			System.out.println("Enter Item QUantity: ");
			Scanner input3 = new Scanner(System.in);
			itemsQuantity[i] = input3.nextInt();
			
		}
		
		System.out.println("*****************Items List With Prices and Total Amount***************************************");
		
		System.out.print("Item Name \t\t");
		System.out.print("Item Price \t\t");
		System.out.print("Item Quantity \t\t");
		System.out.print("ItemsPricePerQuantity\n");
		System.out.println("***********************************************************************************************\n");
		for(int i=0; i<size;i++)
		{
			System.out.print(itemsNames[i]+"\t\t\t");
			System.out.print(itemsPrice[i]+"\t\t\t\t");
			System.out.print(itemsQuantity[i] +"\t\t\t\t");
			double k = itemsPrice[i] * itemsQuantity[i];
			System.out.print(k +"\n");
			totalAmount+=k;
			
		}	
		DecimalFormat f = new DecimalFormat("###,###,###.00");
		String newFormat ="$"+ f.format(totalAmount);
		System.out.println("\n\t\t\t\t\t\t\t\tTotal cost of all Items:" +newFormat);
		
	}
}
