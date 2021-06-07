package basic;
import java.util.Scanner;

public class AoS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the length of the rec:");
		double length=value.nextDouble();
		System.out.println("Enter the width of the rec:");
		double width=value.nextDouble();
		double area=length*width;
		System.out.println("Enter the area of the rec:"+area);

	}

}
