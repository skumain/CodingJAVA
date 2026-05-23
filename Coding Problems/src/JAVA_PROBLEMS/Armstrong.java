
//Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153
package JAVA_PROBLEMS;

public class Armstrong {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = 154;
	
	int x= IsArmstrong(n);
	if(x==n)
	System.out.println("It is armstrong number");
	else
		System.out.println("It is not");
		
	}
	
	public static int IsArmstrong(int n)
	{
	
		int s=0;
		
		while(n>0)
		{
			int a = n%10;
			s=s+ a*a*a;
			n=n/10;
		}
		
		return s;
		
	}

}
