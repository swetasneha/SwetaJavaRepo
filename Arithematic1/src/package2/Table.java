package package2;

import java.util.Scanner;

public class Table {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Input Number to print Multiples");
		int a=obj.nextInt();
		System.out.println("How many multiples do you need");
		int b=obj.nextInt();
		System.out.println("The multiples are");
		for(int i=1;i<=b;i++)
		{
			int sum=(a*i);
			System.out.println(+sum);
		}
		
	}

}
