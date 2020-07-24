package package2;

public class Doubleloop3 {
	static int i;
	static int j;
	public static void main(String[] args) {
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(+j);
			}
			System.out.println(+i);
		}
	}

}
