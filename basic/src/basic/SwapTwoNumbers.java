package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20,j=30;
		System.out.println("--Before Swap--");
		System.out.println("First Value="+i);
		System.out.println("Second Value="+j);
		int temp=i;
		i=j;
		j=temp;
		System.out.println("--After Swap--");
		System.out.println("First Value="+i);
		System.out.println("Second Value="+j);
	}

}
