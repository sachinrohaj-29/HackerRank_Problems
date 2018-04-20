package com.sachin.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class H7_Binary_searsch_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		//Set<String> s1 = new HashSet<String>();
		
		l1 = Arrays.asList("sears","pune","acolade");
		//l1.stream().map(l -> l+"sachin").forEach(l -> System.out.println(l));
		
		//l1.stream().forEach(s -> System.out.println(s));
		//l1.forEach(s -> System.out.println(s));
		l1.stream().collect(Collectors.toList()).forEach(s1 -> System.out.println(s1));
		//l1.stream().
				
		// Adding no greater than 10
		List<Integer> ll = new ArrayList<Integer>();
		ll = Arrays.asList(1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99);
		
		int sum10 = ll.stream().filter(l -> l>10).mapToInt(i -> i).sum();
		int sum9 = ll.parallelStream().filter(l -> l>8).mapToInt(l -> l).sum();		
		System.out.println(sum10 +" "+ sum9);
				
		// Converting to Upper Case
		List<String> ll1 = new ArrayList<String>();
		ll1 = Arrays.asList("sears","pune","acolade");
		//ll1.parallelStream().map(l -> l.toUpperCase()).forEach(l -> System.out.println(l));
		List<String> ls = ll1.parallelStream().map(l -> l.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);

		//Sorting the List
		List<String> ls1 = ll1.stream().map(l -> l.toUpperCase()).sorted().collect(Collectors.toList());
				System.out.println(ls1);
		
		
		Map<Integer, String> map = new HashMap<>();
		
		int[] array = {23,43,56,97,32};
  	  	Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
  	  
	}
}
