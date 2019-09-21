package com.nt.array;

import java.util.Arrays;

public class FindPairsOfSumGivenValue {

	int[] input = {3, 6, 8, -8, 10, 8 };
	int sum = 16;
	
	public void getPairOfSum() {
		
		for (int i = 0; i < input.length-1; i++) {
			for (int j = i+1; j < input.length; j++) {
				
				//int add = input[i]+input[j];
				
				//if (sum == add) {
				//	System.out.print("("+input[i]+","+input[j]+") ");
				//}
				
				if (input[i]+input[j] == sum) {
					System.out.print("("+input[i]+","+input[j]+") ");
				}
			}
		}
		
	
		
	}
	
	public static void main(String[] args) {
	
		FindPairsOfSumGivenValue find = new FindPairsOfSumGivenValue();
		
		find.getPairOfSum();

	}

}
