package package2;

public class Child2 extends Parent1 {
public void Method5()
{
	System.out.println("Child: This is Default Method");
}
public void Method6(int a)
{
	System.out.println("Child: This is 1 parameterized Method");
}
public void Method7(int a, int b, int c)
{
	super.Method4(1,2,3,4);
	System.out.println("Child: This is 3 parameterized Method");
}
public void Method8(int a, int b, int c, int d)
{
	this.Method7(1, 2, 3);
	this.Method6(1);
	this.Method5();
	System.out.println("Child: This is 4 parameterized Method");
}
public static void main(String[] args) {
	Child2 obj=new Child2();
	obj.Method8(1, 2, 3,4);
}
}
