package com.velocity;

import java.util.Scanner;

public class MissingElement {
	
	public static void main(String[] args) {
		
		// Create one array and take input from user
		
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter how many element to add in array");
			int n=scanner.nextInt();
			int[] x=new int[n];
			System.out.println("Enter array data");
			for (int i = 0; i < n; i++) {
				
				x[i]=scanner.nextInt();
			// array data taken from user and assigned to index	
			}
			
			System.out.println("Array elements are-->");
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {

					int temp=0;
					if (x[j]<x[i]) {
						
						temp=x[i];
						x[i]=x[j];
						x[j]=temp;
						
					}
					
				}
				System.out.println(x[i]);
				//displayed array data
			}
			
			// code for finding missing data
			
			System.out.println("Missing elemets are-->" );
			for (int i = 0; i < n-1; i++) {
			   for (int j = x[i]+1; j < x[i+1]; j++) {
				
				   System.out.println(" " +j);
			}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
