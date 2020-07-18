package package2;

public class Parent {
public Parent() {
	this(1,2,3,4);
	System.out.println("Parent: This is default Constructor");
}
public Parent(int a) {
	this();
	System.out.println("Parent: This is 1 parameterized constructor");
}
public Parent(int a, int b) {
	this(1,2,3);
	System.out.println("Parent: This is 2 parameterized constructor");
}
public Parent(int a, int b, int c) {
	this(1);
	System.out.println("Parent: This is 3 parameterized constructor");
}
public Parent(int a, int b, int c, int d) {
	System.out.println("Parent: This is 4 parameterized constructor");
}
}
