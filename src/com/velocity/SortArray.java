package com.velocity;

public class SortArray {
	
	public static void main(String[] args) {
		
		int a[]= {20,30,15,25,40};
		
		System.out.println("Array elements before Asending order");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		
		System.out.println("\nArray after Sorting in asending order");
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {

				int temp=0;
				if (a[j]<a[i]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			System.out.print(a[i] + " ");
		}
		
	}

}
