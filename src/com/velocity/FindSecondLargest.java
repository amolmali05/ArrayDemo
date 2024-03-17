package com.velocity;


public class FindSecondLargest {

	public static void main(String[] args) {
		

	int a[]= {78,45,5,100,56};
		int max1=a[0];
	    int max2=a[1];
		
	    for (int i = 2; i < a.length; i++) {
			
	    	if (a[i]>max2) { //5>45 ,100>45
				max2=a[i]; //max2=100
			}
	    	if (max2>max1) { //45>78 ,100>78
				int temp=max1; //temp=78
				max1=max2;     //max1=100 
				max2=temp;    //max2=78
			}
		}
	    System.out.println("second larget element-->" +max2);
	}
}
