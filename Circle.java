package blcprogram;

public class Circle {

	public static String getArea (double radius){
		 if (radius <= 0) {
			return "0";
		}
		else {
			double area= Math.PI * radius * radius;
			return String.format("%2f", area);
		}
		
	}
	
	}


