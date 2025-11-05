package com.demo;

public class Stack {
	int size;
	private int[] rStack;
	int top;
	
	Stack(int size) {
		this.size = size;
		this.rStack = new int[size];
		this.top = 0;
	}
	
	public void push(int ele) {
		if(top == size-1) {
			System.out.println("--- Stack Overflow! ---");
		}
		else {
			rStack[top++] = ele;
			System.out.println("--- Data Stored... ---");
		}
	}
	
	public void pop() {
		if(top ==)
	}
}
