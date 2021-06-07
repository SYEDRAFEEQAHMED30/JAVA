package basic;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		boolean isPrime=true;
		Scanner value=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=value.nextInt();
			value.close();
		for(int i=2;i<=num/2;i++)
		{
			a=num%i;
			if(a==0)
			{
				isPrime=false;
				break;
			}
		}
if(isPrime)

	System.out.println("is a prime"+num);

else

	System.out.println("is not a prime"+num);

	}

}
