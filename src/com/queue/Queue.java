package com.queue;

import java.util.LinkedList;

public class Queue {
	
	LinkedList<Integer> queue = new LinkedList<>();
	
	public void insert(int data) {
		queue.addLast(data);
	}
	
	public void display() {
		System.out.println("---Elements In Queue---");
		for (Integer integer : queue) {
			System.out.println(" "+integer);
		}
	}
}
