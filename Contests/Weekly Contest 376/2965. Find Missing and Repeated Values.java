class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ;j++){
                arr[grid[i][j]]++;
            }
        }
        int array[] = new int[2];
        for(int i = 1;i < arr.length; i++){
            if(arr[i] == 2) array[0] = i;
            if(arr[i] == 0) array[1] = i;
        }
        return array;
    }
}
