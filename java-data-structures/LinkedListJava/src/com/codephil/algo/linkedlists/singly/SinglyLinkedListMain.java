package com.codephil.algo.linkedlists.singly;

import java.util.LinkedList;

public class SinglyLinkedListMain {
	public static void main(String[] args){
		
		SinglyLinkedList<String> list = new SinglyLinkedList<String>(null);
		
		for(int i = 0; i < 10; i++){
			list.insertNode(new SinglyLinkedListNode<String>(null, "Testing" + i));
		}
		
		SinglyLinkedListNode<String> temp = list.getHead();
		do{
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}while(temp != null);
		
		
		System.out.println(list.findNode("Testing8").getData());
		
		list.replaceNode(new SinglyLinkedListNode<String>(null, "test-replace"), "Testing4");
		
		temp = list.getHead();
		do{
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}while(temp != null);
		
	}
}
