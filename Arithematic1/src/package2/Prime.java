package package2;

import java.util.Scanner;

public class Prime {
	static int i;
	static int a;
	static int n;
	public static boolean Method() {
		for (i=2;i<a;i++)
		{
			if (a%i==0)
			{
			return false;
			}
		}
		return true;
	}
		public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter a Number to check Prime or not");
		Prime.a=obj.nextInt();				
			if(a>=2 && Method())
				System.out.println("PRIME");
				else
				{
					System.out.println("NOT PRIME");
				}
			}	
}
