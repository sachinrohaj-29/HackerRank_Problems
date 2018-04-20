package com.sachin.HackerRank;

import java.util.Scanner;

public class H1_ArrayLeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int[] b = new int[n];
		if(k==0){			
			for(int p=0; p<n; p++){
				b[p]=a[p];
			}
		}
		
		else{
			for(int i=0; i < k; i++){ 					
				for(int j=0; j<n; j++){
					if((j+1) == n)
						b[j] = a[0];
					else
						b[j] = a[j+1];
				}
				
				for(int p=0; p<n; p++){
					a[p]=b[p];
				}
			}
		}		
		
		return b;      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        
        // Solution as per the comments.
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
		    int newLocation = (i + (n - k)) % n;
		    a[newLocation] = in.nextInt();
		}
        
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        
        /*
        // My Solution
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      */
        System.out.println();
      
    }

}
