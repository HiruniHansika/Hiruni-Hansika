package com.Hiruni.Hansika;
import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		double radius;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of Circle : ");
        radius=sc.nextDouble(); 
        double Perimeter=2*3.14*radius;
        System.out.print("Perimeter of Circle : " + Perimeter );
	}

}
