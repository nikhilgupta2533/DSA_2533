class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is towards left (including mid)
                high = mid;
            } else {
                // Peak is towards right
                low = mid + 1;
            }
        }

        // low == high is the peak index
        return low;
    }
}
