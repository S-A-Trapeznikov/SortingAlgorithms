package com.epam.trapeznikau;

public class Sort {
	
	public static <T extends Number> T [] bubbleSortMinMax(T arr[]){
				
		int sizeArr;
		sizeArr = arr.length;
		T temp;
		for (int j=0; j<sizeArr;j++)
		for (int i=0; i<sizeArr;i++){
			if (((Comparable)arr[j]).compareTo((Comparable)arr[i])==-1){temp=arr[j];
											 							arr[j]=arr[i];
											 							arr[i]=temp;}
			}
		return arr;
	}	
	
	public static <T extends Number> T [] bubbleSortMaxMin(T arr[]){
		
		int sizeArr;
		sizeArr = arr.length;
		T temp;
		for (int j=0; j<sizeArr;j++)
		for (int i=0; i<sizeArr;i++){
			if (((Comparable)arr[j]).compareTo((Comparable)arr[i])==1){temp=arr[j];
											 							arr[j]=arr[i];
											 							arr[i]=temp;}
			}
		return arr;
	}	
	
	public static <T extends Number> T [] selectionSortMinMax(T arr[]){
		
		int sizeArr = arr.length;
		T temp;
		int min;
		for (int j=0; j<sizeArr;j++){
			min = j;
			for (int i=j; i<sizeArr;i++)
				if (((Comparable)arr[i]).compareTo((Comparable)arr[min])==-1) min = i;
					
			temp = arr[j];
			arr[j] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static <T extends Number> T [] selectionSortMaxMin(T arr[]){
		
		int sizeArr = arr.length;
		T temp;
		int max;
		for (int j=0; j<sizeArr;j++){
			max = j;
			for (int i=j; i<sizeArr;i++)
				if (((Comparable)arr[i]).compareTo((Comparable)arr[max])==1) max = i;
					
			temp = arr[j];
			arr[j] = arr[max];
			arr[max] = temp;
		}
		return arr;
	}
		
	public static <T extends Number> T [] insertionSortMinMax(T arr[]){
		
		int sizeArr = arr.length;
		T min;
		int index;
		for (int j=1; j<sizeArr;j++){
			min = arr[j];
			index = j;
			while (index>0 && ((Comparable)min).compareTo((Comparable)arr[index-1])==-1 ){
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = min;	 
		}
		return arr;
	}
	
	public static <T extends Number> T [] insertionSortMaxMin(T arr[]){
		
		int sizeArr = arr.length;
		T max;
		int index;
		for (int j=1; j<sizeArr;j++){
			max = arr[j];
			index = j;
			while (index>0 && ((Comparable)max).compareTo((Comparable)arr[index-1])==1 ){
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = max;	 
		}
		return arr;
	}
	
	public static <T extends Number> T [] quickSortMinMax(T arr[], int low, int high){
		int middle = low+(high-low)/2;
		T pivot = arr[middle];
		int i =low;
		int j =high;
		while (i<=j){
			
			while(((Comparable)arr[i]).compareTo((Comparable)pivot)==-1) i++;
			while(((Comparable)arr[j]).compareTo((Comparable)pivot)==1)	j--;
			
			if (i<=j){
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
			if (j>low) arr = quickSortMinMax(arr,low, j);
			if (i<high)	arr = quickSortMinMax(arr,i, high);
	
		}
		return arr;
	}
	
	public static <T extends Number> T [] quickSortMaxMin(T arr[],int low, int high){
		int middle = low+(high-low)/2;
		T pivot = arr[middle];
		int i =low;
		int j =high;
		while (i<=j){
			
			while(((Comparable)arr[i]).compareTo((Comparable)pivot)==1) i++;
			while(((Comparable)arr[j]).compareTo((Comparable)pivot)==-1)	j--;
			
			if (i<=j){
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
			if (j>low) arr = quickSortMaxMin(arr,low, j);
			if (i<high)	arr = quickSortMaxMin(arr,i, high);
	
		}
		return arr;
	}
			
}


	

