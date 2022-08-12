class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if (root == null) return null;
        
        int curr = root.val;
        
        if(p.val > curr && q.val> curr) 
            return lowestCommonAncestor(root.right,p,q);
        if(p.val < curr && q.val< curr) 
            return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}
