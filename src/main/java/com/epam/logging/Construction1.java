package com.epam.logging;

public class Construction1 
{
	
		int choice,area;
		
		public Construction1(int choice,int area)
		{
			this.choice=choice;
			this.area=area;
		}

		 public int ConstructionCost()
		    {
			 	if(choice>4 || choice<1)
		    		return 0;
		    	else
		    	{	int costs[] = {12000,15000,18000,25000};
		    		int total_cost= area * costs[choice-1];
		    		return total_cost;
		    	}
		    }

}
