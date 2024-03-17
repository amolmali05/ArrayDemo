package com.velocity;

public class forEachExample {

	public static void main(String[] args) {
		
		int []x = {2,5,1,10};
		int min=x[0];
		for (int i : x) {
			
			if (i<min) {
				min=i;
			}
			}
		System.out.println("Minimun number is " +min);
	}
}
