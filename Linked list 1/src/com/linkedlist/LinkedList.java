package com.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		Node firstNode = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);

		Node head = firstNode;
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		Node tail = thirdNode;

		Node temp = head;
		System.out.println("Linked List Element");
		while (temp != null) {
			System.out.println(" "+temp.getData());
			temp = temp.getNext();
		}
	}
}