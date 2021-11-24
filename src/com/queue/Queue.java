package com.queue;

import java.util.LinkedList;

public class Queue {
	
	LinkedList<Integer> queue = new LinkedList<>();
	
	public void enQueue(int data) {
		queue.addLast(data);
	}
	
	public void deQueue() {
		if(queue.size() != 0) {
			queue.pop();
		}else {
			System.out.println("Queue Is Empty");
		}
	}
	
	public void display() {
		System.out.println("---Elements In Queue---");
		for (Integer integer : queue) {
			System.out.println(" "+integer);
		}
	}
}
