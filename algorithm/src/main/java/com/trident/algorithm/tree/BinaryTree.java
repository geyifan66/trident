package com.trident.algorithm.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

    /**
     * 1
     * 2   3
     * 4  5   6
     *
     * @return
     */
    public static TreeNode<String> init() {
        TreeNode<String> node = new TreeNode<>("1", null, null);
        TreeNode<String> left2 = new TreeNode<>("2", null, null);
        TreeNode<String> left3 = new TreeNode<>("3", null, null);
        TreeNode<String> left4 = new TreeNode<>("4", null, null);
        TreeNode<String> left5 = new TreeNode<>("5", null, null);
        TreeNode<String> left6 = new TreeNode<>("6", null, null);
        node.setLeft(left2);
        node.setRight(left3);

        left2.setLeft(left4);
        left2.setRight(left5);

        left3.setRight(left6);
        return node;
    }

    /**
     * 一行打印层序遍历
     */
    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode current;
        queue.offer(root);

        while(!queue.isEmpty()){
            current = queue.poll();

            System.out.print(current.getData()+"--->");

            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }
    }

    /**
     * 换行打印层序遍历
     */
    public static void levelOrderWithLine(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode current;
        queue.offer(root);

        TreeNode<String> last = root;
        TreeNode<String> nLast = null;

        while(!queue.isEmpty()){
            current = queue.poll();

            System.out.print(current.getData()+"--->");

            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
                nLast = current.getLeft();
            }

            if (current.getRight() != null) {
                queue.offer(current.getRight());
                nLast = current.getRight();
            }

            if (current == last) {
                last = nLast;
                System.out.println("");
            }

        }

    }

    public static void main(String[] args) {
        TreeNode root = BinaryTree.init();

        BinaryTree.levelOrderWithLine(root);
    }

}
