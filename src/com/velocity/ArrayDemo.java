package com.velocity;

public class ArrayDemo {

	//Different ways of initialize,declare,instanttiate array
	public static void main(String[] args) {
		
		int a[]=new int [3];
		a[0]=10;
		a[1]=20;
		int[] b=new int[10];
		int []c=new int[7];	
		
		int x[]= {10,20,30};
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(a[i]);
			System.out.println(x[i]);
			System.out.println("FB1");
		}		
	}

}
