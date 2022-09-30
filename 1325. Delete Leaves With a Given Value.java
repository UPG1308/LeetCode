class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root.left != null) root.left = removeLeafNodes(root.left , target);
        if(root.right != null) root.right = removeLeafNodes(root.right , target);
        
        return root.right == root.left && root.val == target ? null : root;
    }
}
