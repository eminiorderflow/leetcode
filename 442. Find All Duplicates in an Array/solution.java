class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupes = new ArrayList<Integer>();

        if (nums.length == 0 | nums.length == 1) {
            return new ArrayList<>(0);
        } else {
            for (int i = 0; i < nums.length; i++){
                if (nums[Math.abs(nums[i]) - 1] < 0) {
                    dupes.add(Math.abs(nums[i]));
                } else {
                    nums[Math.abs(nums[i]) - 1] = -1 * nums[Math.abs(nums[i]) - 1];
                }
            }
            return dupes;
        }
    }
}
