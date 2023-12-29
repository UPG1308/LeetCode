class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length;
        int ans[][] = new int[n/3][3];
        Arrays.sort(nums);
        if(n%3 != 0) return new int[][]{};
        for(int i = 2; i < n; i = i + 3){
            if(nums[i] - nums[i - 2] >k) return new int[][]{};
        }
        
        
        for(int i = 0; i < n; i++){
            ans[i/3][i%3] = nums[i];
        }
        return ans;
    }
}
