class Solution {
    
    private int maxDepth = 0;
    private TreeNode lca;
    
    public TreeNode lcaDeepestLeaves(TreeNode root) 
    {
        //lca = root;
        dfs(root , 0);
        return lca;
    }
    
    public int dfs(TreeNode root, int currDepth)
    {
        // calculate deepest
        maxDepth = Math.max(maxDepth, currDepth);
        
        // base condition
        if(root == null) return currDepth;
        
        // left and right depths
        int left = dfs(root.left, currDepth + 1);
        int right = dfs(root.right,  currDepth + 1);
        
        // set lca
        if(left == maxDepth && right == maxDepth) lca = root;
        
        return Math.max(left, right);
    }
}
