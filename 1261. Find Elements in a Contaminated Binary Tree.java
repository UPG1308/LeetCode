class FindElements {

    HashSet<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        dfs(root, 0);
    }
    
    public void dfs(TreeNode root, int val)
    {
        if(root == null) return;
        set.add(val);
        dfs(root.left, 2 * val + 1);
        dfs(root.right, 2 * val + 2);
        
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}
