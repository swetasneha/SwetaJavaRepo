package package2;

public class Explicit {
	public static void main(String[] args) {
		double d =100.0222;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		System.out.println("The value of Double: " +d);
		System.out.println("The value of Float: " +f);
		System.out.println("The value of Long: " +l);
		System.out.println("The value of Int: " +i);
	}

}
