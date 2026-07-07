package com.tasks;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			// Find pivot position
			int pivotIndex = partition(arr, low, high);

			// Sort left part
			quickSort(arr, low, pivotIndex - 1);

			// Sort right part
			quickSort(arr, pivotIndex + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
	    int[] arr = {38, 27, 43, 3, 9, 82, 10};
	    quickSort(arr,0,arr.length-1);
	    System.out.println("sorted array:");
	    System.out.println(Arrays.toString(arr));
	    

	}

	

}
