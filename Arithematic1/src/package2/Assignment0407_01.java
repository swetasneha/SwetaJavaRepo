//This keyword used with methods
package package2;

public class Assignment0407_01 {
	public void method1(int a, int b, int c)
	{
		System.out.println("Three Parameteried Method" );
		this.method2();
		this.method3(1,2,3,4);
		this.method4(1,2);
		this.method5(1);
	}
	public void method5(int a)
	{
		System.out.println("One Parameterized Method");
	}
	public void method2()
	{
		System.out.println("Default Method");
	}
	public void method4(int a, int b )
	{
		System.out.println("Two Parameterized Method");
	}
	public void method3(int a, int b ,int c, int d)
	{
		System.out.println("Four Parameterized Method");
	}

	public static void main(String[] args) {
		Assignment0407_01 obj=new Assignment0407_01();	
		obj.method1(1,2,3);
	}

}
