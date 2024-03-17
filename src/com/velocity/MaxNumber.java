package com.velocity;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		int array[]=new int[] {10,34,67,37,27};
		int max=array[0];
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Maximum numbrr from array is " +max);
		
	}

}
