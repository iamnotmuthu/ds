package org.learning.treeTraversals;

import java.util.Stack;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class PreOrderIterate {

	public static void main(String[] args) {
		Node root=Tree.getTree();
		preOrder(root);
		
	}

	private static void preOrder(Node root) {
		if(root==null)
			return;
		Stack<Node> s=new Stack();
		while(!s.isEmpty() || root!=null) {
			if(root!=null) {
				System.out.println(root.data);
				s.push(root);
				root=root.left;
			}else {
				root=s.pop();
				root=root.right;
			}
		}
		
	}

}
