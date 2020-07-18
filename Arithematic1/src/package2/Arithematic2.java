package package2;

public class Arithematic2 {
public int sub(int a, int b)
{
	int c=(a-b);
	return c;
}
public int sum(int a, int b)
{
	int c=(a+b);
	return c;
}
public int mul(int a, int b)
{
	int c=(a*b);
	return c;
}
public void div(int a, int b)
{
	int c=(a/b);
	System.out.println("The result of the operation (((((10-2)+2)+2)*2)/2)= " +c);
}
public static void main(String[] args) {
		final int f=2;
		Arithematic2 obj=new Arithematic2();
		int a=obj.sub(10, f);
		int b=obj.sum(a, f);
		int c=obj.sum(b, f);
		int d=obj.mul(c, f);
		obj.div(d, f);
}
}
