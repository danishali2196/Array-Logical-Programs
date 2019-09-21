package com.nt.array;

import java.util.Arrays;

public class FindMinAndMaxElementInArray {
	
	int[] input = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
	
	
	public static void main(String[] args) {
		
		FindMinAndMaxElementInArray fmamea = new FindMinAndMaxElementInArray();
		
		fmamea.getMax();
		fmamea.getMin();
		
		fmamea.usingSortingGetMinMax();
	}
	
	
	public void getMax(){
		
		int maxValue = input[0];
		
		for (int i = 0; i < input.length; i++) {
			
			for (int j = i+1; j < input.length; j++) {
				
				if (input[i] > maxValue) {
					
					maxValue = input[i];
				}
				
			}
			
			
		}
		System.out.println("Max Value :: "+maxValue);
		
	}
	
	public void getMin(){
		
		int minValue = input[0];
		
		for (int i = 0; i < input.length; i++) {
			
				
				if (input[i] < minValue) {
					
					minValue = input[i];
				}
				
			
			
		}
		System.out.println("Min Value :: "+minValue);
		
	}
	
	
	public void usingSortingGetMinMax(){
		
		Arrays.sort(input);
		
		int minValue = input[0];
		int maxValue = input[input.length-1];
		
		System.out.println("Min Value :: "+minValue+",  Max Value :: "+maxValue);
		
	}
	
	
	
}
