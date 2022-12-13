package easy;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 */
/*
Runtime 0 ms Beats 100%
Memory 41.4 MB Beats 60%
 */
public class InvertBinaryTree226 {
    public static void main(String[] args) {
        //root = [2,1,3]
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(node);
        System.out.println(invertTree(node));
    }


    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }


    // Definition for a binary tree node.
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
