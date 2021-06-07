package basic;
import java.util.Scanner;
public class AoT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner value=new Scanner(System.in);
System.out.println("Enter the width value:");
double width=value.nextDouble();
System.out.println("Enter the height value:");
double height=value.nextDouble();
double area=(height*width)/2;
System.out.println("Enter the area value"+area);
	}

}
