package com.Hiruni.Hansika;

public class LargestSmallest {

	public static void main(String[] args) {
		int number[] = new int[] { 29, 46, 32, 45, 21, 98, 20, 12,5, 67};

		int Smallest = number[0]; 
		int Largest  = number[0]; 

		for (int i = 1; i < number.length; i++)  
		{
			if (number[i] > Largest ) 
			{
				Largest = number[i];
			}
			if (number[i] < Smallest) 
			{
				Smallest = number[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + Largest );
		System.out.println("Smallest Number in a given array is : " + Smallest);
	
	}

}
