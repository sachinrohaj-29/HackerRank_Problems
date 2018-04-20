package com.sachin.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class H2_Anagram {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
                
        Map<Character,Integer> aMap = new HashMap<Character,Integer>();
        Map<Character,Integer> bMap = new HashMap<Character,Integer>();
        
        for(int i=0; i<a.length(); i++){
        	int aMapVal = aMap.containsKey(a.charAt(i)) ? aMap.get(a.charAt(i)) + 1 : 1;
        	aMap.put(a.charAt(i), aMapVal);
        }
        
        for(int i=0; i<b.length(); i++){
        	int bMapVal = bMap.containsKey(b.charAt(i)) ? bMap.get(b.charAt(i)) + 1 : 1;
        	bMap.put(b.charAt(i), bMapVal);
        }
        
        List<Character> dMap = new ArrayList<Character>(); 
        int pCount = 0;
        int nCount = 0;
        for(Character ca : aMap.keySet()){
        	for(Character cb : bMap.keySet()){
        		if(ca == cb){
        			if(aMap.get(ca) == bMap.get(cb)){
        				pCount = pCount+2;
        				dMap.add(ca);
        			}
        			else if((aMap.get(ca) > bMap.get(cb)) || (aMap.get(ca) < bMap.get(cb))){
        				pCount = pCount+2;
        				nCount = nCount+(Math.abs(aMap.get(ca)-bMap.get(cb)));
        				dMap.add(ca);
        			}
        			else{
        				// do nothing        				
        			}
        		}        			
        	}        	
        }
        
        for(Character da : dMap){
        	aMap.remove(da);
        	bMap.remove(da);
        }
        
        for(Character caa : aMap.keySet()){
        	nCount = nCount+aMap.get(caa);
        }
        
        for(Character cbb : bMap.keySet()){
        	nCount = nCount+bMap.get(cbb);
        }
        
        System.out.println(nCount);
        //System.out.println("pCount: "+pCount);
	}*/
	
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;			
			//System.out.println(c-'a');
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		
		for( int i=0; i < lettercounts.length; i++){
			System.out.println(lettercounts[i]);
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
