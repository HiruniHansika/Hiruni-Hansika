package com.Hiruni.Hansika;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length:");
        double l= sc.nextDouble();
        System.out.println("Enter the breadth:");
        double w= sc.nextDouble();
        double  area=l*w;
        System.out.println("Area of Rectangle is: " + area);  
	}

}
