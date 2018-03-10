package com.Hiruni.Hansika;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		    double radius;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the Radius : ");
	        radius=sc.nextDouble(); 
	        double area=3.14*radius*radius;
	        System.out.print("Area of Circle : "+ area);

	}

}
