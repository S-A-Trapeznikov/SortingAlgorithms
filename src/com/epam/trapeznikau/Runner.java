package com.epam.trapeznikau;

public class Runner {
	
	public static void main (String [] args){
		
		Integer arr[] = {1,5,4,8,3,9,4,-5,6,20,50,10,-10,0};
		Float arr2[] = {1f,5f,4f,8f,3f,9f,4f,-5f,6f,20f,50f,10f,-10f,0f};
		Integer arr3[];
		Integer arr4[];
		Float arr5[];
		
		arr3 = Sort.quickSortMinMax(arr,0,arr.length-1);
		
		for(int i=0;i<arr3.length; i++)
			System.out.println(i+" : "+arr3[i]);
		
		arr4 = Sort.quickSortMaxMin(arr,0,arr.length-1);

		for(int i=0;i<arr4.length; i++)
			System.out.println(i+" : "+arr4[i]);
		
//
		
	} 
}
