package com.trident.algorithm.tree;

import lombok.Data;

@Data
public class TreeNode<T> {
    private T data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
        super();
    }

    public TreeNode(T data, TreeNode left, TreeNode right) {
        super();
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
