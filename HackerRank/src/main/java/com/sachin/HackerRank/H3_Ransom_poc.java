package com.sachin.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H3_Ransom_poc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        scanner.nextLine();
        String magazine = scanner.nextLine();
        String note = scanner.nextLine();
        scanner.close();
        
        Map<String,Integer> validationMap = new HashMap<String,Integer>();
        
        String[] magazineArray = magazine.split(" ");
        for(String magazieWord : magazineArray){
        	int vMapVal =  validationMap.containsKey(magazieWord) ? validationMap.get(magazieWord)+1 : 1;
        	validationMap.put(magazieWord, vMapVal);
        }
        
        String[] ransomArray = note.split(" ");
        for(String magazieWord : ransomArray ){
        	int vMapVal =  validationMap.containsKey(magazieWord) ? validationMap.get(magazieWord)-1 : -1;
        	validationMap.put(magazieWord, vMapVal);
        }

        String flag = "Yes";
        for(String val : validationMap.keySet()){
        	if(validationMap.get(val) < 0){
        		flag = "No";
        		break;
        	}        		
        }
        System.out.println(flag);
	}

}
