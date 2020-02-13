package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;
//TODO
public class LowestcommonAncestor {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(lca(root,7,5));

	}

	private static Node lca(Node<Integer> root, int i, int j) {
		if(root==null)
			return null;
		if(root.data==i || root.data==j)
			return root;
		Node left=lca(root.left,i,j);
		Node right=lca(root.right,i,j);
		
		if(left!=null && right!=null) {
			return root;
		}
		if(left==null && right ==null)
			return null;
		
		
		return left!=null ?left:right;
	}

}
