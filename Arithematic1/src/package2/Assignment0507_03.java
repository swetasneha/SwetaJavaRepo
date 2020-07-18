package package2;

import java.util.Scanner;

public class Assignment0507_03 {
	public float Add(float a, float b)
	{
		float c=(a+b);
		return c;
	}
	public float Sub(float a, float b)
	{
		float c=(a-b);
		return c;
	}
	public float Mul(float a, float b)
	{
		float c=(a*b);
		return c;
	}
	public float Div(float a, float b)
	{
		float c=(a/b);
		return c;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		Assignment0507_03 s=new Assignment0507_03();
		System.out.println("Solve (((((x1+x2)-x3)+x4)*x5)/x6) by entering desired values");
		System.out.println("Value of x1= ");
		float a=obj.nextFloat();
		System.out.println("Value of x2= ");
		float b=obj.nextFloat();
		System.out.println("Value of x3= ");
		float c=obj.nextFloat();
		System.out.println("Value of x4= ");
		float d=obj.nextFloat();
		System.out.println("Value of x5= ");
		float e=obj.nextFloat();
		System.out.println("Value of x6= ");
		float f=obj.nextInt();
		float g=s.Add(a,b);
		float h=s.Sub(g,c);
		float i=s.Add(h,d);
		float j=s.Mul(i,e);  
		float k=s.Div(j,f);
		System.out.println("The Result is: " +k);
}
}