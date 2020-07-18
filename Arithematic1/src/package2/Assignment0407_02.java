//This Keyword used with Constructors
package package2;

public class Assignment0407_02 {
	public Assignment0407_02() 
	{
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	public Assignment0407_02(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public Assignment0407_02(int a, int b )
	{
		this(1,2,3);
		System.out.println("Two Parameterized Constructor");
	}
	public Assignment0407_02(int a, int b, int c)
	{
		this(1);
		System.out.println("Three Parameterized Constructor");
	}
	public Assignment0407_02(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Assignment0407_02 obj=new Assignment0407_02(1,2);
		}
}


