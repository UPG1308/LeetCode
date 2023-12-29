class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int begin = 0;
        long sum = 0, perimeter = 0;
        for(int end = 0; end < nums.length; end++){
            // sum += nums[end];
            if(sum > nums[end] && sum + nums[end] > perimeter){
                perimeter = Math.max(perimeter, sum + nums[end]);
            }
            sum += nums[end];
        }
        return perimeter == 0? -1: perimeter;
    }
}
