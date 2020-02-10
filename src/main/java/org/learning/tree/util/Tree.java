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
 *                        \
 *                         9
 *                          \
 *                           7
 *                          /
 *                         0
 *                          
 *                          
 *                          
 *                          
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
		Node<Integer> zero=new Node<Integer>(0);
		two.left.left=zero;
		
		zero.right=new Node(9);
		zero.right.right=new Node(7);
		zero.right.right.left=new Node(0);
		
		
		
		return root;
		
	}
	
}
