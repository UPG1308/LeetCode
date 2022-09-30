class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int lastLevelValue = 1;
        int currentTotalValue = 0;
        while(currentTotalValue < label)
        {
            currentTotalValue = currentTotalValue + lastLevelValue;
            lastLevelValue = lastLevelValue * 2;
        }
        lastLevelValue = lastLevelValue / 2;
        
        List<Integer> ans = new LinkedList<>();
        
        while(label != 1)
        {
            ans.add(label);
            int complement = ((3 * lastLevelValue) - label - 1);
            int parent = complement / 2;
            label = parent;
            lastLevelValue = lastLevelValue / 2;
            
        }
        
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
