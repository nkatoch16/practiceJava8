package com.learnjava.practice;

public class SelectionSort{
	static int i;
	static int temp,element;
	//selection sorting done here
	public static void SelectionSort(int[] arr,int n){
		//while condtion to check the loop and increment
		int smallest = arr[0];
		int init = 0;
		while(i < n){
			//temporary variable to keep incrementing the value of the i
			int temp = i+1;
			//condition to check whether the temp reaches arrayofbounderror
			if(temp == n){
				//increment the init value so array can check from the next sorted number
				element = init++;
				i = element-1;
			}
			//condition to check the if i number is greater then i+1 number
			else if(arr[init] > arr[temp]){
				//put the previous value in the i+1 element
				//swap the variable position there
				smallest = arr[init];

				//actua sorted element were stored here
				arr[init] = arr[temp];

				//to keep the second position from the value traced
				arr[i+1] = smallest;
			}
			//increment the value of the i
			i++;
		}
		//for loop the print the array of an element
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args){
		//creating object for the class
		SelectionSort sort = new SelectionSort();
		int[] array  = {55,32,56,10,20,5,1,0,90,150,500,200};
		int arraylength = array.length;
		System.out.println("The Sorted array format is:");
		sort.SelectionSort(array,array.length);
	}
}