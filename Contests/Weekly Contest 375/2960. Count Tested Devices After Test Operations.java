class Solution {
    public int countTestedDevices(int[] arr) {
        int count = 0, j = 0;
        int n = arr.length;
        while(j < n){
            if(arr[j] > count) count++;
            j++;
        }
        
        return count;
    }
}
