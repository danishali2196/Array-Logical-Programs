package com.nt.array;

public class SumOfUniqueElement {

	
	int[] input ={1, 6, 4, 3, 2, 2, 3, 8, 1};
	int output = 0;
	public void sumOfUniqueElement() {
		System.out.println("SumOfUniqueElement.sumOfUniqueElement()");
		for (int i = 0; i < input.length; i++) {
			int j;
			for ( j = 0; j < input.length; j++) {
				if (input[i] == input[j]) {
					break;
				}
			}
				if (i == j) {
				 output += input[i];
				}
				
			}
			System.out.println(output);

	//	int[] input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		
	}
	
	public static void main(String[] args) {
		float start = System.currentTimeMillis();
		
		
		SumOfUniqueElement rde = new SumOfUniqueElement();
		rde.sumOfUniqueElement();
		
		float end = System.currentTimeMillis();
		System.out.println("time ::"+ (end - start));
	}
}
