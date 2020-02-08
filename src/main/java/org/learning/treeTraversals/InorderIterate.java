package org.learning.treeTraversals;

import java.util.Stack;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class InorderIterate {

	public static void main(String[] args) {
		Node<Integer> root=Tree.getTree();
		inorder(root);
	}

	private static void inorder(Node<Integer> root) {
		if(root==null) {
			return;
		}
		Stack<Node> stk=new Stack();
		
		while(!stk.isEmpty() || root!=null) {
			if(root!=null) {
				stk.push(root);
				root=root.left;
			}
			else {
				root=stk.pop();
				System.out.println(root.data);
				root=root.right;
			}
		}
	}
}