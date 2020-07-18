package package2;

import java.util.Scanner;

public class Factorial {
	static int a;
	static long sum=1;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial");
		a=obj.nextInt();
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		System.out.println(+sum);
	}
}