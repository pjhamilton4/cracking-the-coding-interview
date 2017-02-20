package com.codephil.algo.linkedlists.singly;

public class SinglyLinkedListNode<T> {

	private SinglyLinkedListNode<T> nextNode;
	private T data;
	
	public SinglyLinkedListNode(SinglyLinkedListNode<T> nextNode, T data) {
		super();
		this.nextNode = nextNode;
		this.data = data;
	}

	public boolean hasNextNode(){
		if(this.nextNode != null){
			return true;
		}else{
			return false;
		}
	}
	
	public SinglyLinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(SinglyLinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((nextNode == null) ? 0 : nextNode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinglyLinkedListNode<T> other = (SinglyLinkedListNode<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (nextNode == null) {
			if (other.nextNode != null)
				return false;
		} else if (!nextNode.equals(other.nextNode))
			return false;
		return true;
	}
	
	
}
