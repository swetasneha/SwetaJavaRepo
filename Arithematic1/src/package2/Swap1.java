package package2;

import java.util.Scanner;

public class Swap1 {
	static int a;
	static int b;
	static int c;	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Value of a");
		a=obj.nextInt();
		System.out.println("Enter the Value of b");
		b=obj.nextInt();
		System.out.println("After Swaping new values are");
		c=Swap1.b;
		Swap1.b=Swap1.a;
		Swap1.a=c;
		System.out.println("Value of a= "+a);
		c=Swap1.b;
		Swap1.b=Swap1.a;
		Swap1.b=c;
		System.out.println("Value of b= "+b);

	}
}

