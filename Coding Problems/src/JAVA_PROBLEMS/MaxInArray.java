package JAVA_PROBLEMS;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 15, 11, 0, 6, 23 };
		System.out.print(getMaxElement(a));

	}

	public static int getMaxElement(int[] a) {
		
		int max= a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		
		return max;

	}

}
