package org.learning.tree.count;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

/**
 * Find if any path available with given sum 
 * @author Muthu
 *
 */
public class PathWithSum {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(pathSum(root,21));
	}

	private static boolean pathSum(Node<Integer> root, int sum) {
			return false;
	}

}
