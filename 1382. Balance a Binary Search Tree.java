class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        helper(root);
        
        return construct(0, list.size() - 1);
    }
    
    private void helper(TreeNode root)
    {
        if(root == null) return ;
        helper(root.left);
        list.add(root);
        helper(root.right);
    }
    
    private TreeNode construct(int start,int end)
    {
        if(start > end) return null ;
        
        int mid = start + (end - start)/2;
        TreeNode root = list.get(mid);
        root.left = construct(start, mid - 1);
        root.right = construct(mid + 1, end);
        return root;
    }
}
