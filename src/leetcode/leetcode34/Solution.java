package leetcode.leetcode34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean left = true;
        boolean right = false;
        int left_position = position(nums,target,left);
        int right_position = position(nums,target,right);
        int[] result = {left_position,right_position};
        return result;
    }

    public int position(int[] nums, int target, boolean flag){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] > target)
                right = mid - 1;
            else if (nums[mid] < target)
                left = mid + 1;
            else{
                if (flag){
                    if (mid - 1 >= 0 && nums[mid - 1] == nums[mid])
                        right = mid - 1;
                    else
                        return mid;
                }else{
                    if (mid + 1 < nums.length && nums[mid + 1] == nums[mid])
                        left = mid + 1;
                    else
                        return mid;
                }
            }
        }
        return -1;
    }
}