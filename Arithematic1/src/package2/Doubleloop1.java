package package2;

public class Doubleloop1 {
	public static void main(String[] args) {
		for (int i=1; i<=6; i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
