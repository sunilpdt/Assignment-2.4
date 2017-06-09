package com.ascii;

import java.util.Scanner;

public class TestDemo {
	
	    public static void main(String args[])
	    {
		
	        String ch;
	        int i;
	        
	        System.out.println("Please enter a number:");
	        Scanner scanInput=new Scanner(System.in);
	        i=scanInput.nextInt();
	        
	        if(i==0){
	        	ch = new Character((char)i).toString();
	        	System.out.println("You Have Entered Zero");
		           System.out.print("Ascii value of "+i+ " -> " + ch + "\t");
	        }
	        else if(i>0){
	        	
	        	ch = new Character((char)i).toString();
	        	System.out.println("You Have Entered Positive Value");
		           System.out.print("Ascii value of "+i+ " -> " + ch + "\t");
	        }
	        else{
	        	
	        	ch = new Character((char)i).toString();
	        	System.out.println("You Have Entered Negative Value");
		           System.out.print("Ascii value of "+i+ " -> " + ch + "\t");
	        }
	        }
	        	
	           
	       
			
	    
	}

