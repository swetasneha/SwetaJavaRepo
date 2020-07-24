package package2;

public class Doubleloop4 {
	static int i;
	static int j;
	static int k=1;
	public static void main(String[] args) {
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k++);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
