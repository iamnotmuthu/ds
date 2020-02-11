package org.learning.structure;

import java.util.LinkedList;
import java.util.Queue;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class DeleteIter {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		deleteTree(root);

	}

	private static void deleteTree(Node<Integer> root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList();
		q.add(root);

		while (!q.isEmpty()) {
			root = q.remove();

			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
			System.out.println("deleting" + root);
			root = null;

		}

	}

}
