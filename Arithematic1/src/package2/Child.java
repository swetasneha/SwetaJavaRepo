package package2;

public class Child extends Parent {
	public Child() {
		this(1);
		System.out.println("Child: This is default constructor");
	}
	public Child(int a) {
		this(1,2,3);
		System.out.println("Child: This is 1 parameterized constructor");
	}
	public Child(int a, int b, int c) {
		super(1,2);
		System.out.println("Child: This is 3 parameterized constructor");
	}
	public Child(int a, int b, int c, int d) {
		this();
		System.out.println("Child: This is 4 parameterized constructor");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Child obj=new Child(1,2,3,4);
	}
}

