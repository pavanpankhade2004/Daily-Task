package com.pavan.Exception_Handling;

public class ExceptioneHandlingDemo {
	
	
	public static void handleExceptions(String input)
	{
		try {
			if(input=="null") {
				throw new NullPointerException("NullPointerException: Input is null.");
			}
			System.out.println("Length of the input string:"+input.length());
			
			int number =Integer.parseInt(input);
			System.out.println("Converted to integer:"+number);
			
			System.out.println("Uppercase version: "+number);
			
			
		}
		catch(NumberFormatException nf ) {
			System.out.println("NumberFormatException: Input is not a valid integer.!");
		}
		catch( NullPointerException np ) {
			System.out.println("NullPointerException: Input is null.");
		}
		
		
			
		
	}

	public static void main(String[] args) {
		
		handleExceptions("null");
	}

}
