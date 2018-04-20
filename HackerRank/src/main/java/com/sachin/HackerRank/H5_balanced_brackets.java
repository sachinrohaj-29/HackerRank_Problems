package com.sachin.HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class H5_balanced_brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
	}    
		
	public static boolean isBalanced(String expression) {
		//String s = "([{{}])";
		
		/*boolean flag = true;
		if(expression.length()%2 == 0){
			for(int i=(expression.length()/2)-1,j=(expression.length()/2); j<expression.length(); i--,j++){
				char[] c = expression.toCharArray();
				if(c[i] == '{'){
					if(c[j] != '}'){ flag = false;}
				}
				else if(c[i] == '['){
					if(c[j] != ']'){ flag = false;}
				}
				else if(c[i] == '('){
					if(c[j] != ')'){ flag = false;}
				}
				else
					flag = false;				
			}
			return flag;
		}
		else
			return false;*/
		boolean flag = true;
				
		for(int i=0; i<expression.length(); i++){
			char[] c = expression.toCharArray();			
			
			if(i==0 && (c[i] == ')' || c[i] == ']' || c[i] == '}')){
				flag = false;
			}
			
			else if(i==(expression.length()-1) && (c[i] == '{' || c[i] == '[' || c[i] == '(')){
				flag = false;
			}
			
			else{
			if(c[i] == ')'){
				if(c[i-1] == '('){}
				else if(c[i-1] == ')'){}
				else if(c[i-1] == ']'){}
				else if(c[i-1] == '}'){}
				else{
					flag = false;
					break;
				}	
			}
			
			if(c[i] == ']'){
				if(c[i-1] == '['){}
				else if(c[i-1] == ')'){}
				else if(c[i-1] == ']'){}
				else if(c[i-1] == '}'){}
				else{
					flag = false;
					break;
				}
			}
			
			if(c[i] == '}'){
				if(c[i-1] == '{'){}
				else if(c[i-1] == ')'){}
				else if(c[i-1] == ']'){}
				else if(c[i-1] == '}'){}
				else{
					flag = false;
					break;
				}
			}
			}
		}	
		return flag;
    }
}
