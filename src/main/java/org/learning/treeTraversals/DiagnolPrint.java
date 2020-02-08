package org.learning.treeTraversals;

import java.util.LinkedList;
import java.util.Queue;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class DiagnolPrint {
	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		print(root);
	}

	private static void print(Node<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList();
		q.add(root);
		q.add(null);

		while (q != null) {
			root = q.remove();
			if (root == null) {
				System.out.println();
				q.add(null);
				root=q.remove();
				if(root==null)
					return;
			}

			while (root != null) {
				System.out.println(root.data);
				if (root.left != null)
					q.add(root.left);
				root = root.right;
			}

		}
	}
}
