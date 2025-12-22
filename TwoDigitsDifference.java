package blcprogram;

public class TwoDigitsDifference {

	public static int getDiffOfDigits(int num) {
		
		int first=num%10;
		int last =num/10;
		return last-first;
		
	}

}
