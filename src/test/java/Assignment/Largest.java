package Assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of the array:");

		int size = s.nextInt();

		int[] a = new int[size];

		System.out.println("Enter array elements");

		for (int i = 0; i < a.length; i++) {

			a[i] = s.nextInt();
		}

		int largest = 0;
		int secondLargest = largest;
		for (int j = 0; j < a.length; j++) {

			if (largest < a[j]) {
				largest = a[j];
				
			}
			
			if(secondLargest>largest)
			{
				secondLargest=a[j];
				
			}
			

		}
		System.out.println(largest + ": is the largest value in array");
		
		

	}
}
