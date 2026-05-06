package com.ArrayWith2D;

public class RowColumsum {

	public static void main(String[] args) {
int arr [][]= {{24,5},{4,6}};
for(int i=0;i<arr.length;i++) {
	int rowsum=0;
	int column=0;
	for(int j=0;j<arr[i].length;j++) {
		rowsum=rowsum+arr[i][j];
		column=column+arr[j][i];
	}
	System.out.println("row of the sum:"+rowsum);	
	System.out.println(column);
	
}



	}

}
