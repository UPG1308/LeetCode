class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int shift = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i % 2 == 0) shift = (j + k%m)%m;
                else shift = (m + j - k%m)%m;
                if(mat[i][shift] != mat[i][j]){
                     return false;
                }
            }
        }
        return true;
    }
}
