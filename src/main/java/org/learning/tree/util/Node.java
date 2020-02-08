package org.learning.tree.util;

public class Node<T> {

	public Node<T> left;
	public Node<T> right;
	public T data;
	public Node(Node<T> left, T data, Node<T> right) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	public Node( T data) {
		this(null,data,null);
	}
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
