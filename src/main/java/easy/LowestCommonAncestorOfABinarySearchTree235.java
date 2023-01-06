package easy;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that
 * has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
/*
Runtime 4 ms Beats 100%
Memory 42.8 MB Beats 98.25%
 */
public class LowestCommonAncestorOfABinarySearchTree235 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node = new TreeNode(1);
        root.right = node;

        System.out.println(lowestCommonAncestor(root, root, node));

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == null || q == null || root == null) return root;
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
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

