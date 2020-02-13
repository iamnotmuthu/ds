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
		if (root == null)
			return;
		Stack<Node> s = new Stack();
		while (!s.isEmpty() || root != null) {
			if (root != null) {
				s.add(root);
				root = root.left;
			} else {
				root = s.peek().right;
				if (root == null) {
					Node temp = s.pop();
					System.out.println(temp.data);
					while (!s.isEmpty() && temp == s.peek().right) {
						temp = s.pop();
						System.out.println(temp.data);
					}
				}
			}
		}

	}
}
