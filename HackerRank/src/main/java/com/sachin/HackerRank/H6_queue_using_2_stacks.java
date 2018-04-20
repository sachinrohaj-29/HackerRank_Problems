package com.sachin.HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class H6_queue_using_2_stacks {

	public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
        	stackNewestOnTop.push(value);        	
        	stackOldestOnTop.removeAllElements();
        	
        	for(int i=stackNewestOnTop.size()-1; i >= 0; i--){        		
        		stackOldestOnTop.push(stackNewestOnTop.get(i));        		
        	}
        	//System.out.println("Stack1: " + stackNewestOnTop);
        	//System.out.println("Stack2: " + stackOldestOnTop);
        	
        }

        public T peek() {
             return stackOldestOnTop.peek();
        }

        public T dequeue() {
        	stackNewestOnTop.remove(0);
        	return stackOldestOnTop.pop();        	
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter =0 ;
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
                counter++;
            }
        }
        System.out.println("Counter:" + counter);
        scan.close();
    }

}
