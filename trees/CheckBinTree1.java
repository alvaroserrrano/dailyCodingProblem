// Check if a binary tree is balanced (two subtrees differ in height by no more than one)
//O(n log(n))

class CheckBinTree1 {
    private class TreeNode {
        Node left;
        Node right;
        int value;
    }

    int getHeight(TreeNode root) {
        if (root == null)
            return -1;
        return Math.max(getHeight(root.left), getHeight(root.right));
    }

    boolean isBalanced(TreeNode root) {
        if (root == null)
            return true; // base case
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1)
            return false;
        else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}