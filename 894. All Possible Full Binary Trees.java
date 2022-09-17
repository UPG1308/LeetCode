class Solution {
    private Map<Integer, List<TreeNode>> map = new HashMap<>();
    
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if(n % 2 == 0) return res;
        if(map.containsKey(n)) return map.get(n);
        if(n == 1)
        {
            res.add(new TreeNode(0));
            return res;
        }
        n--;
        for(int i = 1;i < n; i++)
        {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i);
            
            for(TreeNode l:left)
            {
                for(TreeNode r:right)
                {
                    TreeNode curr = new TreeNode(0);
                    curr.left = l;
                    curr.right = r;
                    res.add(curr);
                }
            }
        }
        map.put(n,res);
        return res;
    }
}
