class Solution {
    public boolean canJump(int[] nums) {
        int max_index = nums.length - 1;

        int i = max_index;
        while (i >= 0) {
            if (nums[i] + i >= max_index) {
                max_index = i;
            }
            i--;
        }
        return max_index == 0;
    }
}