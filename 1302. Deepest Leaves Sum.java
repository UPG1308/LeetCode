class Solution {
    private int sum = 0;
    private int maxlevel = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        int level = 1;
        callevel(root, level);
        return sum;
        
    }
    
    public void callevel(TreeNode root, int level)
    {
        if(root == null) return;
        if(level > maxlevel)
        {
            sum = 0;
            maxlevel = level;
        }
        if(level == maxlevel)
        {
            
            sum = sum + root.val;
        }
        callevel(root.left, level + 1);
        callevel(root.right, level + 1);
    }

}
