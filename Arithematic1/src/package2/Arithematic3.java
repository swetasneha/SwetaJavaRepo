package package2;

public class Arithematic3 {
	public int mul(int a, int b)
	{
		int c=(a*b);
		return c;
	}
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
	public void div(int a, int b)
	{
		int c=(a/b);
		System.out.println("The result of the Operation (((((10*2)-2)+2)-2)/2)= " +c);
	}
public static void main(String[] args) {
	final int f=2;
	Arithematic2 obj=new Arithematic2();
	int a=obj.mul(10, f);
	int b=obj.sub(a, f);
	int c=obj.sum(b, f);
	int d=obj.sub(c, f);
	obj.div(d,f);

}
}
