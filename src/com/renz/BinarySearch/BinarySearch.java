package com.renz.BinarySearch;
/*
 * Search from the array list
 * Jayson Mallari
 */
import java.util.Scanner;
public class BinarySearch {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] array = { 32,37,99,84,86,30,42,56,77,102,56} ;
		int findNum;
		
		/*This will allow user to fill up the array
			for(int x=0; x< array.length; x++){
				System.out.println(x + ": ");
				array[x] = in.nextInt();
			}*/

		for(int x=0; x< array.length; x++){
			System.out.print(array[x] + "\t ");
		}
			
			
			binarySearch(array,0,array.length,31);
			binarySearch(array,0,array.length,30);
	}
	
	//Search function													
	public static void binarySearch(int[] arr,int min, int max, int num){
		
		int position;
		
		position = (min + max) /2;  
		
		while((arr[position] != num) && (min <= max)){
			if (arr[position] > num){ 
				max =  position - 1;
			}
			else{
				min = position + 1;
			}

		
		position = (min + max) /2;
		
	}
	
	if ( min <= max){
		System.out.print("\nThe number "+ num + " was found at the position: "+position);
	}
	else{
		System.out.print("\nNumber "+ num +" was NOT found");
	}
}
}
