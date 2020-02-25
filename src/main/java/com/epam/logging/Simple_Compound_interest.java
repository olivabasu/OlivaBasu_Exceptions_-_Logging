package com.epam.logging;

public class Simple_Compound_interest
{
	
    double principle_amt;
    double interest_rate;
    int time_period,times_interest_applied;

   public Simple_Compound_interest(double principle_amt, double interest_rate, int time_period,int times_interest_applied) 
   {
       this.principle_amt = principle_amt;
       this.interest_rate = interest_rate;
       this.time_period = time_period;
       this.times_interest_applied=times_interest_applied;
   }

   public double getSimpleInterest()
   {
       return (principle_amt*interest_rate*time_period)/100;
   }
   public double getCompoundInterest()
   {
       return principle_amt*Math.pow(1+interest_rate/100*times_interest_applied,times_interest_applied*time_period);
   }


}



