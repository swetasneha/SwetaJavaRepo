package package2;

import java.util.Scanner;

public class Palindrome {
	static int a;
	static int n;
	static int sum;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter the number to be checked for Palindrome");
		a=obj.nextInt();
		int temp=a;
		while (a>0)
		{
			int r=a%10;
			sum=(sum*10)+r;
			a=a/10;		
		}
		if(temp==sum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
