package basic;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20,j=40;
		System.out.println("--Before Swap--");
		System.out.println("First Value="+i);
		System.out.println("Second Value="+j);
i=i-j;
j=i+j;
i=j-i;
System.out.println("--After Swap--");
System.out.println("First Value="+i);
System.out.println("Second Value="+j);
	}

}
