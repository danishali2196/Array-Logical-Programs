package com.nt.array;

public class RemoveDuplicateElement {

	
	int[] input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
	
/*	public void removeElement() {
		int temp = 0;
		int result = 0;
		
		for (int i = 0; i < input.length-1; i++) {
		
			if (input[i] == input[i+1]) {
					temp= input[i]; 
			}
			else{
				 result = input[i]; 
				System.out.print(result +", ");
			}
			
		}
		//System.out.println(result);
		//System.out.println(temp);
	}
	*/
	public static void main(String[] args) {
		RemoveDuplicateElement rde = new RemoveDuplicateElement();
		rde.removeElement();
	}
	
	public void removeElement() {
		System.out.println("RemoveDuplicateElement.removeElement()");
		for (int i = 0; i < input.length; i++) {
			int j;
			for ( j = 0; j < input.length; j++) {
				if (input[i] == input[j]) {
					break;
				}
			}
				if (i == j) {
					System.out.println(input[i]);
				}
				
			}
			

	//	int[] input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		
	}
}//class
