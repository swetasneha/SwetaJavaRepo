package package2;



public class FiboniciSeries {
	static int a=0;
	static int b=1;
public static void main(String[] args) {
		System.out.println(+a);
		System.out.println(+b);
		for(int i=2;i<10;++i)
		{
			int sum=a+b;
			System.out.println(+sum);
			a=b;
			b=sum;
		}
		
     }
}
