//ELC
package com.pavan.Exception_Handling;

//ELC
public class CarUser{

	public static void main(String[] args) {
         try {
			CarTest.stop("stop");
		} catch (CarStoppedException e) {
			System.out.println(e.getMessage());
		}
         
         try {
        	 CarTest.puncture("puncture");
        	 
         }
         catch(  CarPunctureException  e)
         {
        	 System.out.println(e.getMessage());
         }
         
        	 try {
        		 CarTest.carHeat("careHeat");
        	 }
        	 catch( CarHeatException e )
        	 {
        		 System.out.println(e.getMessage());
        	 }
        	System.out.println("Car check completed");
         }
	   
}

 


