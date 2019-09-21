package com.nt.array;

import java.util.Arrays;

public class Find3LargestNo {

	
	int[] input ={1, 6, 4, 3, 7, 2, 5, 5, 3, 8, 1};
	
	public void findLargest() {
		System.out.println("Find3LargestNo.findLargest()");
			
		Arrays.sort(input);
		
		System.out.println(input[input.length-3]);
		
	}
	
	
/*	public void findLargest() {
		System.out.println("Find3LargestNo.findLargest()");
			
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
		
		System.out.println(input[input.length-3]);
	}	*/
		
	public static void main(String[] args) {
		float start = System.currentTimeMillis();
		
		
		Find3LargestNo rde = new Find3LargestNo();
		rde.findLargest();
		
		float end = System.currentTimeMillis();
		System.out.println("time ::"+ (end - start));
	}
}
