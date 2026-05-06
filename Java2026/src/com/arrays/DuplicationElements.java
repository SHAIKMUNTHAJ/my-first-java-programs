package com.arrays;

public class DuplicationElements {

	public static void main(String[] args) {

		int arr[]= {10,20,30,10,40,20,10,40};
		boolean[] bol= new boolean[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
		
			if(bol[i]==false) {
				bol[i]=true;
				count=0;
			
		
		for(int j=i;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
			         bol[j]=true;
			        count++;
			        
				
			}
		}
//		if(count>1) {
//			System.out.println(arr[i]);
//		}
		System.out.println(arr[i]+" count : "+count);
			}
		}
		
	}

}
