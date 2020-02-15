package org.learning.tree.amzProblems;

import java.util.LinkedList;
import java.util.Queue;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;
/**
 * @author Muthu
 * 
 * Find shortest path between 2 nodes. All nodes in tree are reachable via root. But, shortest path may  or may not pass through root.
 *
 */
public class ShortestPath {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		int distance = getShortestPath(root, 20, 5);
		System.out.println("Distance is " + distance);

	}

	private static int getShortestPath(Node<Integer> root, int x, int y) {
		Node lca = getLca(root, x, y);
		System.out.println(lca);
		int xdis = getDis(root, lca, x);
		int ydis = getDis(root, lca, y);

		return xdis + ydis;
	}

	private static int getDis(Node<Integer> root, Node lca, Integer x) {
		if (root == null)
			return -1;
		Queue<Node> q = new LinkedList();
		q.add(root);
		int dis = 0;
		boolean start = false;
		while (!q.isEmpty()) {
			int cursize = q.size();
			while (cursize > 0) {
				Node cur = q.remove();
				if (cur.data == lca.data) {
					start = true;
				}
				if (x.equals(cur.data))
					return dis;
				if (cur.left != null)
					q.add(cur.left);
				if (cur.right != null)
					q.add(cur.right);
				cursize--;
			}
			if (start)
				dis++;
		}

		return dis;
	}

	private static Node getLca(Node<Integer> root, int x, int y) {
		if (root == null) {
			return null;
		}
		if (root.data == x || root.data == y) {
			return root;
		}
		Node left = getLca(root.left, x, y);
		Node right = getLca(root.right, x, y);

		if (left == null && right == null) {
			return null;
		}
		if (left != null && right != null)
			return root;
		if (left != null)
			return left;
		else
			return right;
	}
}
