package package2;

import java.util.Scanner;

public class DynamicAdd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the Numbers for Addition:");
		System.out.println("Enter the first Number" );
		int a=obj.nextInt();
		System.out.println("Enter the Second Number" );
		int b=obj.nextInt();
		int c=a+b;
		System.out.println("The Addition of two Number is: " +c);
	
	}

}
