package com.arrays;
//sum of the lestsum=sum of the rightsum;

public class Equlibrium {
	
public static void main(String[] args) {
int arr[]= {1,3,5,2,23};
//leftsum=1+3=4
//rightsum=2+2=4
//lefsum=rightsum

int totalsum=0;


for(int i=0;i<arr.length;i++) {
	totalsum=totalsum+arr[i];
}
int lefsum=0;
int found=-1;
for(int i=0;i<arr.length;i++) {
	int rightsum=totalsum-lefsum-arr[i];
if(lefsum==rightsum) {
	found=i;
	break;
}
lefsum=lefsum+arr[i];
}

if(found!=-1) {
	System.out.println("equlibrium:"+found);
}else {
	System.out.println("-1");
}

	}

}
