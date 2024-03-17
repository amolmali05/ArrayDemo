package com.velocity;

public class MultiDementionalArray {

	
	public static void main(String[] args) {
		
		String arr[]= {"amol","mali","Pransh"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
			
		}
		
	int a[][]=new int[3][2];	
	int b[][]= {{1,2,5},
	{2,3,6}	};
	
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.printf("Element at b["+i+"]["+j+"] :" ,+i +""+j);
			System.out.println(b[i][j]);
		}
	}
	}
}
