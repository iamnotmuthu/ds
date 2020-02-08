package org.learning.treeTraversals;

import java.util.Stack;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class PostOrderIterate {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		postOrder(root);
	}

	private static void postOrder(Node<Integer> root) {

		if (root == null) {
			return;
		}
		Stack<Node> s1=new Stack();
		Stack<Node> s2=new Stack();
		
		s1.add(root);
		
		while(!s1.isEmpty()) {
			root=s1.pop();
			if(root.left!=null) {
				s1.add(root.left);
			}
			if(root.right!=null) {
				s1.add(root.right);
			}
		}
			
	}

}
