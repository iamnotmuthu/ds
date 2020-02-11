package org.learning.treeTraversals;

import java.util.LinkedList;
import java.util.Queue;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class BFS {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		bfs(root);

	}

	private static void bfs(Node<Integer> root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.remove();
			System.out.println(temp.data);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
	}

}
