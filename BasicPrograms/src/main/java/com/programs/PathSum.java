package com.programs;

import java.util.Stack;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        stack.push(root);
        sumStack.push(root.val);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            int pathSum = sumStack.pop();

            if (currentNode.left == null && currentNode.right == null && pathSum == targetSum) return true;

            if (currentNode.left != null) {
                stack.push(currentNode.left);
                sumStack.push(pathSum + currentNode.left.val);
            }

            if (currentNode.right != null) {
                stack.push(currentNode.right);
                sumStack.push(pathSum + currentNode.right.val);
            }
        }
        return false;
    }
}
