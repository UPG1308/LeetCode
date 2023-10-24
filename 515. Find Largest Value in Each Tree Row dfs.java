class Solution {
    int size = 0;
    List<Integer> ans = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();
        helper(root, 0);
        return ans;
    }

    public void helper(TreeNode root, int level){
        if(size > level){
            if(ans.get(level) < root.val)
                ans.set(level, root.val);
        } 
        else {
            ans.add(root.val);
            size++;
        }

        if(root.left != null) helper(root.left, level + 1);
        if(root.right != null) helper(root.right, level + 1);
    }
}
