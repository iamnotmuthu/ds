package org.learning.tree.count;

import java.util.Stack;

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
		System.out.println(pathSum(root,28,0));
	}

	private static boolean pathSum(Node<Integer> root, int sum,int tsum) {
		if(root==null) {
			return false;
		}
		tsum=tsum+root.data;
		System.out.println("tesmpsum "+tsum);
		 if( pathSum(root.left,sum,tsum)) {
			 return true;
		 }
		if(root.left==null && root.right==null) {
			if(tsum==sum) {
				return true;
			}
		} if( pathSum(root.right,sum,tsum)) {
			return true;
		}
		tsum=tsum-root.data;
		System.out.println("tesmpsum-- "+tsum);
		return false;
			
	}

}
