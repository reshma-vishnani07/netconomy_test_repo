package com.java.practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {12,13,45,65,78,34,1,32,35};
		int target=34;
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length/2]);
		int mid =arr[arr.length/2];
		int temp;
		if(mid==target) {
			System.out.println("index of target is: "+arr.length/2);
		}else if(mid<target) {
			for(int i=arr.length/2; i<arr.length; i++) {
				if(arr[i]==target) {
					System.out.println("index of target is: "+i);
				}
			}	
		}else {
			for(int i=0; i<arr.length/2; i++) {
				if(arr[i]==target) {
					System.out.println("index of target is: "+i);
				}
			}	
		}
	}
}
