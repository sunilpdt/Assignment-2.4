package com.gradeavg;

import java.util.Scanner;

public class GradeCalc {
public static void main(String[] args){
	int maths=0;
	int physics=0;
	int chemistry=0;
	
	System.out.println("Please enter Physics Marks:");
	Scanner scanPhysics=new Scanner(System.in);
	physics=scanPhysics.nextInt();
	
	System.out.println("Please enter Physics Marks:");
	Scanner scanChemistry=new Scanner(System.in);
	chemistry=scanChemistry.nextInt();
	
	System.out.println("Please enter Physics Marks:");
	Scanner scanMaths=new Scanner(System.in);
	maths=scanMaths.nextInt();
	
	int average=(physics+chemistry+maths)/3;
	System.out.println("Average of PCM is:"+average);
	
	if(average>70)
		System.out.println("You have secured A grade!");
	else if(average >=61 && average<=70)
		System.out.println("You have secured B grade!");
	else
		System.out.println("You have secured C grade!");
}
}
