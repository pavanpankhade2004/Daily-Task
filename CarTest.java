//BLC
package com.pavan.Exception_Handling;


class CarStoppedException extends Exception{
	
	public CarStoppedException(String message)
	{
		super(message);
	}

}
 
class CarPunctureException extends Exception
{
 public CarPunctureException(String message)
 {
	 super(message);
 }
}

class  CarHeatException extends Exception
{
	public  CarHeatException(String message)
	{
		super(message);
	}
}
//blc class
public class CarTest
{
	private static final int temperature = 0;

	public static void stop(String stop) throws CarStoppedException
	{
			if(stop.equalsIgnoreCase("stop"))
			{
				throw new CarStoppedException("Car Stopped for some reson");
			}
			//else {
				//System.out.println("Car not stall");
			//}
		}
	    
	  public static void puncture(String puncture)throws  CarPunctureException
	  {
		  if(puncture.equalsIgnoreCase("puncture"))
		  {
			  throw new CarPunctureException ("Car tyre is punctured");
		  }
		//  else
		  //{
			//  System.out.println("Car is punctured");
		  //}
	  	  }
	  
	  public static void carHeat(String carHeat)throws  CarHeatException
	  {
		  if(carHeat.equalsIgnoreCase("carHeat"))
		  {
			  throw new CarHeatException ("Car engine is Overheated");
		   }
		 else
				  {
					  System.out.println("Car engine is Overheated");
				  }
		 
	  	  }
	  
	}
   

