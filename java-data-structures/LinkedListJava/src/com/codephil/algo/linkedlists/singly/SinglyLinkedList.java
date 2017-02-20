package com.codephil.algo.linkedlists.singly;

public class SinglyLinkedList<T> {

	private SinglyLinkedListNode<T> head;
	private SinglyLinkedListNode<T> tail;

	public SinglyLinkedList(SinglyLinkedListNode<T> head) {
		super();
		this.head = head;
		this.tail = head;
	}

	public void insertNode(SinglyLinkedListNode<T> node){
		if(tail != null){
			this.tail.setNextNode(node);
			this.tail = node;
		}else{
			this.head = node;
			this.tail = node;
		}
		
	}
	
	public SinglyLinkedListNode<T> findNode(T data){
		
		SinglyLinkedListNode<T> found = null;
		
		SinglyLinkedListNode<T> current = this.head;
		while(current != null){
			if(current.getData().equals(data)){
				found = current;
				break;
			}else{
				current = current.getNextNode();
			}
		}
		
		if(found == null){
			throw new NullPointerException("Element not found! " + data);
		}
		return found;
	}
	
	public SinglyLinkedListNode<T> findNode(int index){
		
		int count = 0;
		SinglyLinkedListNode<T> found = null;
		
		SinglyLinkedListNode<T> current = this.head;
		while(current != null){
			if(count == index){
				found = current;
				break;
			}else{
				count++;
				current = current.getNextNode();
			}
		}
		
		if(found == null){
			throw new NullPointerException("Index not found!");
		}
		return found;
	}
	
	public int findIndexOfNode(T data){
		int count = 0;
		
		
		SinglyLinkedListNode<T> current = this.head;
		while(current != null){
			if(current.getData().equals(data)){
				break;
			}else{
				count++;
				current = current.getNextNode();
			}
		}
		
		return count;
	}
	
	
	public void replaceNode(SinglyLinkedListNode<T> newNode, T searchData){
		SinglyLinkedListNode<T> found = this.findNode(searchData);
		
		
		if(found == null){
			throw new NullPointerException("Element not found! " + searchData);
		}else{
			int idx = findIndexOfNode(searchData);
			SinglyLinkedListNode<T> previous = findNode(idx-1);
			newNode.setNextNode(found.getNextNode());
			previous.setNextNode(newNode);
		}
		
	}
	
	public SinglyLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SinglyLinkedListNode<T> head) {
		this.head = head;
	}

	public SinglyLinkedListNode<T> getTail() {
		return tail;
	}

	public void setTail(SinglyLinkedListNode<T> tail) {
		this.tail = tail;
	}
	
	
	
}
