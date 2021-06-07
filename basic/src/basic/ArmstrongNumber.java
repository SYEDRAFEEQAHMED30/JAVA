package basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=373,on,r,result=0;
on=i;
while(i>0) 
{
r=i%10;
i/=10;
result+=Math.pow(r, 3);

}
if(on==result)
{
	System.out.println("it is a Armstrongnumber:"+i);
	
}
else
{
	System.out.println("it is not a Armstrongremainder:"+i);
}
	}

}
