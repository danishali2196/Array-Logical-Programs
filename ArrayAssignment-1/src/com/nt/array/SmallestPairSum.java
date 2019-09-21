package com.nt.array;

import java.util.Arrays;

public class SmallestPairSum {

	
	int arr[] = { 9, 15, 12, 5, 4, 7, 3, 19, 5};
	
	public void getSmallestPair() {
		
		/*Arrays.sort(arr);
		
		int sum = arr[0]+arr[1];
		
		System.out.println("smallest pair sum is :: "+sum);		*/
		
		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < min) {
				
				secondMin = min;
				
				min = arr[i];
			}
			
			else if((arr[i] < secondMin) && arr[i] != min) {
				secondMin = arr[i];
			}
			
		}
		System.out.println("smallest pair sum is :: "+(min+secondMin));
		
	}
	
	
	public static void main(String[] args) {
		
		SmallestPairSum sum  = new SmallestPairSum();
		
		sum.getSmallestPair(); 

	}

}
