package com.programs;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

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

public class BinaryTreeInorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }

    public void traversal(TreeNode root) {
        if (root == null) return;
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);

    }
}
