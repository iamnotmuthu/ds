package org.learning.tree.util;






/**
 * @author Muthu
 * 
 * 
 *                               1
 *                              / \
 *                             2   3
 *                            / \  /\
 *                           4  5 6 7
 *                          /        \
 *                         8          9
 *                         
 *                       
 *                          
 *                          
 *                          
 *                          
 * 
 *
 */


public class Tree {

	public static Node<Integer> getTree() {
		Node<Integer> one=new Node<>(1);
		Node<Integer> two=new Node(2);
		Node<Integer> three=new Node(3);
		Node<Integer> four=new Node<>(4);
		Node<Integer> five=new Node(5);
		Node<Integer> six=new Node(6);
		Node<Integer> seven=new Node<>(7);
		Node<Integer> eight=new Node(8);
		Node<Integer> nine=new Node(9);
		
		four.left=eight;
		seven.right=nine;
		three.left=six;
		three.right=seven;
		two.left=four;
		two.right=five;
		one.left=two;
		one.right=three;
		return one;
		
	}
	
	public static Node<Integer> getBST() {
		Node<Integer> one=new Node<>(1);
		Node<Integer> two=new Node(2);
		Node<Integer> three=new Node(3);
		Node<Integer> four=new Node<>(4);
		Node<Integer> five=new Node(5);
		Node<Integer> six=new Node(6);
		Node<Integer> seven=new Node<>(7);
		Node<Integer> eight=new Node(8);
		Node<Integer> nine=new Node(9);
		Node<Integer> ten=new Node(10);
		Node<Integer> eleven=new Node(11);
		
		two.left=one;
		three.left=two;
		three.right=four;
		ten.right=eleven;
		nine.right=ten;
		
		seven.left=six;
		eight.left=seven;
		eight.right=nine;
		five.right=eight;
		five.left=three;
		
		return five;
		
	}
	
}
