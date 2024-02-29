package com.java.coding.basics.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class InorderTrav {
	
	public List<Integer> inorder(TreeNode node) {

		List<Integer> treeList = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		
		while(node != null && !stack.isEmpty()) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			treeList.add(stack.peek().val);
			node = stack.pop().right;
		}
		return treeList;
	}

}
