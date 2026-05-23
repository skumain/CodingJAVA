package JAVA_PROBLEMS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,2,3,4,5,6,7,8};
		int sum = 9;
		System.out.print(Arrays.toString(twoSum(array,sum)));
		//System.out.print(Arrays.toString(twoSum(array,sum)));
	}

	private static int [] twoSum(int[] array, int sum) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			int complement = sum-array[i];
			if(hmap.containsKey(complement))
			{
				return new int [] {hmap.get(complement),i};
			}
			
				hmap.put(array[i], i);
				System.out.println(hmap);
		}
		
		return new int [] {-1,-1};
	}	
}
