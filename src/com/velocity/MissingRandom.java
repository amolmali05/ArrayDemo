package com.velocity;

public class MissingRandom {
	
	public static void main(String[] args) {
		
		int a[]= {21,23,40,5,39};
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[j]<a[i]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			b[i]=a[i];
			
		}
		
		System.out.println("Missing element in array-->");
		for (int i = 0; i < b.length-1; i++) {
			for (int j = b[i]+1; j < b[i+1]; j++) {
				System.out.print(" "+j);
			}
		}
	}
	}


