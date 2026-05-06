package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,2,1,4};
		
 Set<Integer> values=new HashSet<>();
 for(Integer i: arr) {
	 values.add(i);
 }
 
 
 
 for(Integer i:values) {
	 System.out.print(i+" ");
 }
 
	}

}
