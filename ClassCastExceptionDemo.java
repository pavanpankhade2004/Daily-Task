package com.pavan.Exception_Handling;

public class ClassCastExceptionDemo {

	   
	    public static void handleClassCastException() {

	       
	        Object[] objects = { "Hello", 123, true,1.2f, "Java" };

	       
	        for (Object obj : objects) {
	            try {
	               
	                String str = (String) obj;
	                System.out.println("Casting successful: " + str);
	            } catch (ClassCastException e) {
	               
	                System.out.println(
	                        "ClassCastException: Cannot cast " 
	                        + obj.getClass().getName() 
	                        + " to String.");

	            }
	        }
	    }

	    
	    public static void main(String[] args) {

	       
	        handleClassCastException();
	    }
	}



