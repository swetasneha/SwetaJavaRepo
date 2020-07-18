package package2;

import java.util.Scanner;

public class DynamicMul {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Multiplication between two User entered Numbers:");
		System.out.println("Enter the first Number: ");
		int a=obj.nextInt();
		System.out.println("Enter the second Number: ");
		int b=obj.nextInt();
		int c=(a*b);
		System.out.println("Tne Final Result is: " +c);
		
	}

}
