package package2;

public class Arithematic1 
{
	public int sum(int a, int b)
	{
		int c=(a+b);
		return c;
	}
	public int sub(int a, int b)
	{
		int d=(a-b);
		return d;
	}
	public int mul(int a, int b)
	{
		int e=(a*b);
		return e;
	}
	public void div(int a, int b)
	{
		int f=(a/b);
		System.out.println("The result of the operation (((((10+2)-2)*2)+2)/2)= " +f);
	}
	public static void main(String[] args) 
	{
		final int w=2;
		Arithematic1 obj=new Arithematic1();
		int x=obj.sum(10, w);
		int y=obj.sub(x, w);
		int z=obj.mul(y, w);
		int s=obj.sum(z, w);
		obj.div(s, w);
}
}
