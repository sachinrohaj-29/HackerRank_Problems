package com.sachin.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Unify_poc {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int[] arr = new int[9];
		int[] arrr = {1,4,2,6,4,8,3};
		arr[0]= 12;
		arr[1]= 14;
		arr[2]= 22;
		arr[3]= 11;
		arr[4]= 2;
		arr[5]= 14;
		arr[6]= 22;
		arr[7]= 13;
		arr[8]= 22;		
		
		//List<Integer> arrL = Arrays.asList(arr);
		
		List<Integer> arrL = new ArrayList<Integer>();
		for(int val : arr){
			arrL.add(val);
		}
				
		//====================================================
		System.out.println(IntStream.of(arr).sum());
		//====================================================
		
		int counter = 0;
		int sumArray = 0;
		//int sumOfArray = arrSum(arr,counter,sumArray);
		//System.out.println(sumOfArray);
		//System.out.println("Sum is:" + arrSum(arr,counter,sumArray));
		//int sum = getSum(arr,counter);
		int sum = getSum(arr,arr.length);
		System.out.println("2ndSum is: " + sum);
		//====================================================
		for(int i=0; i <arrL.size(); i++){
			for(int j=i+1; j<arrL.size(); j++){
				if(arrL.get(i) == arrL.get(j)){					
					arrL.remove(j);
				}
			}
		}
		
		for(int val : arrL){
			System.out.println(val);			
		}
		
	}
	
	/*private static int getSum(int[] arr, int Counter) {
		if(Counter+1 < arr.length){			
			//System.out.println("If Counter" + arr[Counter]);
			return arr[Counter] + getSum(arr,++Counter);			
		}
		else{
			//Counter++;
			//System.out.println("Else Counter" + arr[Counter]);
			return arr[Counter];
		}		
	}*/

	private static int getSum(int[] arr, int length) {
		if(length > 1){
			length--;
			return arr[length] + getSum(arr,length);
		}
		else{
			return arr[--length];
		}		
	}
	private static int arrSum(int[] arr, int counter, int sumArray) {
		// TODO Auto-generated method stub		
		if(counter < arr.length){			
			sumArray = sumArray + arr[counter];
			counter++;
			return arrSum(arr,counter,sumArray);
			//System.out.println("in if" + sumArray);
			//return sumArray;
		}
		else{
			System.out.println("in else" + sumArray);
			return sumArray;
		}
			
		//System.out.println("in if" + sumArray);
		
	}

}
