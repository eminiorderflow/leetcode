class Solution {

    private int mid = 0;

    public int searchInsert(int[] nums, int target) {

        int arrMid = nums.length/2;

        if (nums.length >= 2) {

            if (target == nums[arrMid-1]) {
                this.mid += arrMid - 1;
                return mid;
            }

            if (target == nums[arrMid] || (target > nums[arrMid-1] && target < nums[arrMid])) {
                this.mid += arrMid;
                return mid;
            }

            if (target < nums[arrMid-1]) {
                searchInsert(Arrays.copyOfRange(nums, 0, arrMid), target);
            }

            if (target > nums[arrMid]) {
                this.mid += arrMid;
                searchInsert(Arrays.copyOfRange(nums, arrMid, nums.length), target);
            }

        } else {

            if (nums[0] >= target) return this.mid += 0;

            if (nums[0] < target) return this.mid += 1;
        }

        return mid;
    }
}


class Solution {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}