package package2;

public class Arithematic
{
	public int sum(int a, int b)
	{
		int c = (a+b);
		System.out.println("The result of the first operation (10+2)= " +c);
		return c;
		
	}
	
	public int sub(int d, int e)
	{
		int f = (d-e);
		System.out.println("The result of the second operation (10-2)= " +f);
		return f;
		
	}
	
	public void mul(int c, int f)
	{
		int h = (c*f);
		System.out.println("The multiplication of the above two operations is " +h);
	}
	
	public static void main(String[] args) {
		
		Arithematic obj = new Arithematic();
		System.out.println("Perform Operation (10+2)(10-2)");
		int i=obj.sum(10, 2);
		int j=obj.sub(10,2);
		obj.mul(i,j);
	}
}
