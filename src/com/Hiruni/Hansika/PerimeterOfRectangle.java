package com.Hiruni.Hansika;
import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {		
		int length, width, perimeter;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Rectangle :");
		length = sc.nextInt();
		System.out.print("Enter width of Rectangle:");
		width = sc.nextInt();
	    perimeter = 2*(length + width);
	    System.out.print("Perimeter of Rectangle : "+ perimeter);
	}

}
