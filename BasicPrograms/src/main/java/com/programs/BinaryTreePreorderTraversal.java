package com.programs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }

    public void traversal(TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        traversal(root.left);
        traversal(root.right);
    }
}
