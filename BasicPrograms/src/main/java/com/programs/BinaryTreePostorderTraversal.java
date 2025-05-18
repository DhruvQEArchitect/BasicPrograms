package com.programs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        traverse(root.right);
        list.add(root.val);
    }
}
