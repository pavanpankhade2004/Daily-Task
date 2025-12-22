package blcprogram;


public class Hotel {

	
	
	public static double calculateDiscountedAmount(double roomRate, double totalAmount) {
		double discountRate =0.2;
		
	    double calculateTotalAmount( double roomRate,int days) {
			return roomRate * days;
		
		
		int discountRate;
		if(roomRate>=10)
		{
			discountRate =0.20;
		}
		else if(roomRate>=5) {
			discountRate=0.10;
		}
		else if(roomRate>=30) {
			discountRate=0.05;
		}
		else {
			discountRate=0.0;
		}
		
		int totalAmount;
		double finalAmount=totalAmount-(totalAmount*discountRate);
		return finalAmount;
		
	}
	}
		 

	


