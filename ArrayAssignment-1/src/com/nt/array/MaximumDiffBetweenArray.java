package com.nt.array;

import java.util.Arrays;

public class MaximumDiffBetweenArray {

	
	int[] input ={1, 6, 4, 3, 7, 2, 12, 5, 3, 8, 1};
	
	public void findDiffArray() {
		System.out.println("MaximumDiffBetweenArray.findDiffArray()");
			
		Arrays.sort(input);
		
		System.out.println("Maximum Difference Bitween Given Array :: "+ (input[input.length-1]-input[0]));
		
	}
	
	
/*	public void findDiffArray() {
		System.out.println("MaximumDiffBetweenArray.findDiffArray()");
			
		int temp = 0;
		
		for (int i = 0; i < input.length-1; i++) {
			
			for (int j = i+1; j < input.length; j++) {
				
				if (input[i] > input[j]) {
					temp = input[i];
				
					input[i] = input[j];
					
					input[j] = temp;
					
					
				}
			}
		}
		
		System.out.println("Maximum Difference Bitween Given Array :: "+ (input[input.length-1]-input[0]));
	}	*/
		
	public static void main(String[] args) {
		float start = System.currentTimeMillis();
		
		
		MaximumDiffBetweenArray rde = new MaximumDiffBetweenArray();
		rde.findDiffArray();
		
		float end = System.currentTimeMillis();
		System.out.println("time ::"+ (end - start));
	}
}
