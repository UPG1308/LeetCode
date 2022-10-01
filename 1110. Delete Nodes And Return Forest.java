class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        List<TreeNode> remaining = new ArrayList<>();
        Set<Integer> toDelete = new HashSet<>();
        
        for(int i : to_delete) toDelete.add(i);
        
        removeNodes(root, toDelete, remaining);
        if(!toDelete.contains(root.val)) remaining.add(root);
        
        return remaining;
    }
    
    public TreeNode removeNodes(TreeNode root, Set<Integer> toDelete, List<TreeNode> remaining)
    {
        if(root == null) return null;
        
        root.left = removeNodes(root.left, toDelete, remaining);
        root.right = removeNodes(root.right, toDelete,remaining);
        
        if(toDelete.contains(root.val))
        {
            if(root.left != null) remaining.add(root.left);
            
            if(root.right != null) remaining.add(root.right);
            
            return null;
        }
        
        return root;
    }
}
