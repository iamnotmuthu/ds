package org.learning.tree.util;






/**
 * @author Muthu
 * 
 * 
 *                               6
 *                              / \
 *                             3   8
 *                            / \  /\
 *                           2  4 7 9
 *                          /    \   \
 *                         1      5   10
 *                        /
 *                       0
 *                          \9
 * 
 *
 */


public class Tree {

	public static Node<Integer> getTree() {
		Node<Integer> root=new Node<>(6);
		root.left=new Node<Integer>(3);
		root.right=new Node<Integer>(8);
		
		Node<Integer> three=root.left;
		three.left=new Node<Integer>(2);
		three.right=new Node<Integer>(4);
		three.right.right=new Node<Integer>(5);
		
		Node<Integer> eight=root.right;
		eight.left=new Node<Integer>(7);
		eight.right=new Node<Integer>(9);
		eight.right.right=new Node<Integer>(10);
		
		Node<Integer> two=three.left;
		two.left=new Node<Integer>(1);
		two.left.left=new Node<Integer>(0);
		
		
		
		return root;
		
	}
	
}
