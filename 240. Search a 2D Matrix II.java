class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    if(m<1) return false;
    int n = matrix[0].length;
    
    return searchMatrix(matrix, new int[]{0,0}, new int[]{m-1, n-1}, target);
}

private boolean searchMatrix(int[][] matrix, int[] upperLeft, int[] lowerRight, int target) {
	if(upperLeft[0]>lowerRight[0] || upperLeft[1]>lowerRight[1]
			|| lowerRight[0]>=matrix.length || lowerRight[1]>=matrix[0].length) 
		return false;
	if(lowerRight[0]-upperLeft[0]==0 && lowerRight[1]-upperLeft[1]==0)
		return matrix[upperLeft[0]][upperLeft[1]] == target;
	int rowMid = (upperLeft[0] + lowerRight[0]) >> 1;
	int colMid = (upperLeft[1] + lowerRight[1]) >> 1;
	int diff = matrix[rowMid][colMid] - target;
	if(diff > 0) {
		return searchMatrix(matrix, upperLeft, new int[]{rowMid, colMid}, target)
				|| searchMatrix(matrix, new int[]{upperLeft[0],colMid+1}, new int[]{rowMid, lowerRight[1]}, target)
				|| searchMatrix(matrix, new int[]{rowMid+1,upperLeft[1]}, new int[]{lowerRight[0], colMid}, target);
	}
	else if(diff < 0) {
 		return searchMatrix(matrix, new int[]{upperLeft[0], colMid+1}, new int[]{rowMid, lowerRight[1]}, target)
				|| searchMatrix(matrix, new int[]{rowMid+1, upperLeft[1]}, new int[]{lowerRight[0], colMid}, target)
				|| searchMatrix(matrix, new int[]{rowMid+1, colMid+1}, lowerRight, target);
	}
	else return true;
}
}
