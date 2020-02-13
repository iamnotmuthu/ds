package org.learning.treeTraversals;

import java.util.Stack;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class Spiral_BFS {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		spiral(root);

	}

	private static void spiral(Node<Integer> root) {
		if (root == null)
			return;
		Stack<Node> stk1 = new Stack();
		Stack<Node> stk2 = new Stack();
		stk1.add(root);

		while (!stk1.isEmpty() || !stk2.isEmpty()) {
			while (!stk1.isEmpty()) {
				root = stk1.pop();
				System.out.println(root.data);
				if (root.left != null)
					stk2.push(root.left);
				if (root.right != null)
					stk2.push(root.right);
			}
			while (!stk2.isEmpty()) {
				root = stk2.pop();
				System.out.println(root.data);
				if (root.right != null)
					stk1.push(root.right);
				if (root.left != null)
					stk1.push(root.left);
			}

		}

	}

}
