package com.nt.array;



import java.util.*;

class DuplicateElement 
{

	int[] input = {1, 2, 5, 5, 6, 6, 7, 2};
	int list = 0;

	public void findDuplicate(){
	
		System.out.println("findDuplicate() is called");

		for(int i = 0; i<input.length; i++){
		
			for(int j = i+1; j<input.length; j++){
				
					if (input[i] == input[j])
					{
						 list = input[i];
						System.out.println(list);
		
					}//if
					
			}//for
			
		}//for
		
	}

	public static void main(String[] args) 
	{
		
		DuplicateElement de = new DuplicateElement();
		de.findDuplicate();
		
	}
}
