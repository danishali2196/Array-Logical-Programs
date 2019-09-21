package com.nt.array;

import java.util.Arrays;

public class FindSecondMinAndMaxElementInArray {
	
	int[] input = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
	
	
	public static void main(String[] args) {
		
		FindSecondMinAndMaxElementInArray fmamea = new FindSecondMinAndMaxElementInArray();
		
		fmamea.getSecondMax();
		fmamea.getSecondMin();
		
	
	}
	
	
	public void getSecondMax(){
		
		int first=0,second=0;
		
		for (int i = 0; i < input.length; i++) {
			
			for (int j = i+1; j < input.length; j++) {
				
				if (input[i] > first) {
					
					second = first;
					first = input[i];
				}
				
			}
			
			
		}
		System.out.println("Second Max Value :: "+second);
		
	}
	
	public void getSecondMin(){
		
		int first , second;
		
		first = second = Integer.MAX_VALUE;
		
		for (int i = 0; i < input.length; i++) {
				
				if (input[i] < first) {
					
					second = first;
					first = input[i];
				}
				else if (input[i] < second && input[i] != first) {
					second = input[i];
				}
			
		}
		System.out.println("Second Min Value :: "+second);
		
	}
	
	
}
