package Assignment;

import java.util.Scanner;

public class EnterArrayAndReadIt {
public static void main(String[] args) {

	

//	int largest= 0;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size:");
	int size = s.nextInt();
	
	
	int[]a= new int[size];

	System.out.println("Enter the Element:");
	 
	
	
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();

		
	}
	System.out.println("Elements present in the system are:");
	for (int n:a) {
	System.out.println(n+"");
	}
	
}
}
