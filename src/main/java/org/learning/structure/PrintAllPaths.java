package org.learning.structure;

import java.util.Stack;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class PrintAllPaths {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		Stack<Node> stack=new Stack();
		print(root,stack);
	}

	private static void print(Node<Integer> root,Stack s) {
		if(root==null)
			return;
		s.add(root);
		print(root.left,s);
		if(root.left==null && root.right==null)
			System.out.println(s);
		print(root.right,s);
		s.pop();
		
	}

}
