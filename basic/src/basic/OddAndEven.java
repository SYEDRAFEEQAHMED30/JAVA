package basic;
import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a value:");
		int i=reader.nextInt();
		
		if(i%2==0)
		{
			System.out.println("Entered Value is Even:"+i);
		}
		else
		{
			System.out.println("Entered Value is Odd:"+i);
		}

	}

}
