class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        if (m == null || m.length == 0 || m[0].length == 0) return false;
        int rows = m.length, cols = m[0].length;
        int low = 0, high = (rows * cols) - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = m[mid / cols][mid % cols];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
