class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int[] ans = new int[2];
        for(int i: nums1)hs1.add(i);
        for(int i: nums2)hs2.add(i);
        
        for(int i: nums1){
            if(hs2.contains(i)) ans[0]++;
        }
        for(int i: nums2){
            if(hs1.contains(i)) ans[1]++;
        }
        
        return ans;
    }
}
