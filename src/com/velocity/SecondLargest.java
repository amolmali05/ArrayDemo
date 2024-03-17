package com.velocity;

public class SecondLargest {
	
public static void main(String[] args) {
	
	int arr[]= {23,10,45,78,60,100};
	int largest=arr[0];
	int secondlargest=arr[0];
	System.out.println("Array Element are-");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("second Largest number in array-->");
	
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i]>largest) {
			secondlargest=largest;
			largest=arr[i];
		}
		else if (arr[i]>secondlargest && arr[i] !=largest) {
			secondlargest=arr[i];
		}
		
	}
	System.out.println(secondlargest);

}
}
