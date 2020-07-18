package package2;

public class Parent1 {
public void Method()
{
	System.out.println("Parent: This is Default Method");
}
public void Method1(int a)
{
	System.out.println("Parent: This is 1 parameterized Method");
}
public void Method2(int a, int b)
{
	System.out.println("Parent: This is 2 parameterized Method");
}
public void Method3(int a, int b, int c)
{
	System.out.println("Parent: This is 3 parameterized Method");
}
public void Method4(int a, int b, int c, int d)
{
	System.out.println("Parent: This is 4 parameterized Method");
	this.Method();
	this.Method1(1);
	this.Method3(1,2,3);
	this.Method2(1, 2);
}
}
