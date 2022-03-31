package com.linkedlist;

public class Node {
	int data;
	Node next;

	public Node(int data) {
	}
	public Node() {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	public void display() {
		System.out.println(" "+data);
	}
}

