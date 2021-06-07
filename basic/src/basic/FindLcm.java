package basic;

public class FindLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=40,j=80,lcm;
		lcm=(i>j)?i:j;
		while(true)
			if(lcm%i==0&&lcm%j==0)
			{
			System.out.printf("The lcm is %d and %d is %d.",i,j,lcm);	
			break;
			}
		++lcm;
	}

}
