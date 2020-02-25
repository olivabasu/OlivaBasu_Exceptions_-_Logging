package com.epam.logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConstructionMain1
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	LOGGER.info("Enter the total area of the house (in square feet).\n");
	int area=sc.nextInt();
	LOGGER.info("What is the customer's preference?\n"
						+ "1.Use standard materials. (12000INR)\n"
						+ "2.Use above standard materials. (15000INR)\n"
						+ "3.High standard materials.(18000INR)\n"
						+ "4.High standard materials with fully automated home.(25000INR)\n");
	
	int choice=sc.nextInt();
	Construction1 obj=new Construction1(choice,area);
	int result=obj.ConstructionCost();
	if(result==0) {
		LOGGER.error("Invalid choice.\n");
		System.exit(0); }
	else
		LOGGER.info("The total construction cost is : "+result+"INR");
	
	sc.close();
    }

}
