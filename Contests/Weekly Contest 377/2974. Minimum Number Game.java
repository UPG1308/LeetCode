class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        for(int i = 1; i < nums.length ; i = i + 2){
            sort(nums, i - 1, i);
        }
        return nums;
    }
    public void sort(int[] nums,int s,int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
    
}
