package com.sachin.HackerRank;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Basket implements Serializable {
	
		public static void main(String[] args) {
			Map<Square, String> flowers = new HashMap<Square, String>();
			flowers.put(new Square("Rose"), "Rose 212");
			flowers.put(new Square("SunRose"), "SunRose 212");
			Square s = new Square("Rose");
			System.out.println(flowers.get(s));
		}

}

class Square{
	String name;
	Square(String name){
		this.name=name;
	}
}