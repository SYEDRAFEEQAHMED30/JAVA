package basic;
import java.util.Scanner;

class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;
int rev=0;
System.out.println("Input your number and press enter");
Scanner value=new Scanner(System.in);
int num=value.nextInt();
while(num!=0)

{
	rev=rev*10;
	rev=rev+n%10;
	n=n/10;
	
	
}
System.out.println("Reverse the Input number is:"+rev);
	}

}
