package com.programs;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        /**
         * below is recursive implementation
         */
//        if (root == null) return null;
//        TreeNode leftNode = invertTree(root.left);
//        TreeNode rightNode = invertTree(root.right);
//        root.left = rightNode;
//        root.right = leftNode;
//        return root;

        /**
         * below implementation is based upon level order traversal
         */
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();

            TreeNode tempNode = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = tempNode;

            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
        return root;
    }
}
