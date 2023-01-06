package easy;

/**
 *Given a binary tree, determine if it is height-balanced
 */
/*
Runtime 1 ms Beats 97.49%
Memory 44.9 MB Beats 12.91%
 */
public class BalancedBinaryTree110 {

    public static void main(String[] args) {
        //[1,null,2,null,3]
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.right = node3;

        System.out.println("is balanced: " + isBalanced(node1));

    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int diff = depth(root.right) - depth(root.left);
        if(diff < 0) diff *=-1;
        return diff <=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int depth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    static class TreeNode {
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
}
