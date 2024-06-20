class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) return false;
        int low = 0; 
        int high = m * n - 1;
        while (low <= high){
            int middle = (low + high)/2;
            int row = middle / n;
            int col = middle % n;
            int value = matrix[row][col];
            if (value == target) return true;
            if (value < target) low = middle + 1;
            else high = middle - 1;
        }
        return false;
    }
}