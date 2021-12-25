package com.Float;
	import java.util.Scanner;  
	  
	 public class Float {  
	    public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	        System.out.println("Enter first number.");  
	        float f1 = scanner.nextFloat();  
	        System.out.println("Enter second number");  
	        float f2 = scanner.nextFloat();  
	       //return the greater of two values  
	        Float f3= Float.max(f1,f2);  
	        System.out.println("The Max value is: "+f3);  
	    }

		private static Float max(float f1, float f2) {
			// TODO Auto-generated method stub
			return null;
		}  
	}  
