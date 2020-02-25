  package com.epam.logging;
 
  import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 public class App 
  {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
  	public static void main(String[] args) 
  	{
  	        Scanner sc = new Scanner(System.in);
  	        int exit=1;
  	        double principle_amt , interest_rate;
  	        int time_period,times_interest_applied;
  	        while(exit>0)
  	        {
  	        LOGGER.info("Enter the principle amount:\n");
  	        principle_amt = sc.nextDouble();
  	        LOGGER.info("Enter the rate of interest(in percentage): \n");
  	        interest_rate = sc.nextDouble();
  	        LOGGER.info("Enter the time period :\n");
  	        time_period = sc.nextInt();
  	        LOGGER.info("Enter the number of times interest is applied per time period:\n");
          	times_interest_applied=sc.nextInt();
  	        Simple_Compound_interest obj=new Simple_Compound_interest(principle_amt,interest_rate,time_period,times_interest_applied);
  	        LOGGER.info("What do you want to calculate?\n"
  	        					+ "1.Simple Interest\n"
  	        					+ "2.Compound Interest\n");
  	        int choice=sc.nextInt();
  	        switch(choice)
  	        {
  	        case 1:
  	        	LOGGER.info("The Simple Interest calculated is:"+obj.getSimpleInterest()+"\n");
  	        	break;
  	        case 2:
  	        	LOGGER.info("The Compound Interest calculated is:"+obj.getCompoundInterest()+"\n");
  	        	break;
  	        default:
  	        	LOGGER.info("Invalid choice");
  	        
  	        }
  	      LOGGER.info("Press 1 to continue.\n"
  	        				   + "Press 0 to exit.");
  	        exit=sc.nextInt();
  	        
  	        }
  	      LOGGER.info("GoodBye!");
  	        
  	      sc.close();  
  	    }
  	

  }