class Solution {
    public int trap(int[] height) {
        int res = 0, n= height.length;
        int rmax[] = new int[n] ;       
        int lmax[] = new int[n] ;
 
        lmax[0] = height[0];
        for(int i = 1; i < n ; i ++)
        {
            lmax[i] = Math.max(height[i], lmax[i-1]);
        }
        rmax[n-1] = height[n-1];
        for(int i = n-2;i>= 0 ; i--)
        {
            rmax[i] = Math.max(height[i], rmax[i+1]);
        }
        for(int i = 1;i<n-1; i++)
            res = res + (Math.min(lmax[i],rmax[i])-height[i]);
        return res;
        
    }
}
