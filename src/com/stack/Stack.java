package com.stack;

import java.util.LinkedList;

public class Stack {
	LinkedList<Integer> linkedList = new LinkedList<>();
	
	public void insert(int data) {
		linkedList.addFirst(data);
	}
	
	public void display() {
		for (Integer integer : linkedList) {
			System.out.println(" "+integer);
		}
	}
}