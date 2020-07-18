package package2;

import java.util.Scanner;

public class Swap2 {
	static int a;
	static int b;
	static int c;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Value of a");
		Swap2.a=obj.nextInt();
		System.out.println("Enter Value of b");
		Swap2.b=obj.nextInt();
		System.out.println("After Swapping new Values are");
		System.out.println("Value of a= "+b);
		System.out.println("Value of b= "+a);
		
		
	}
}
