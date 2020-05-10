package leetcode.leetcode31;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums != null && nums.length != 0){
            int i = nums.length - 1;
            while (i >= 1){
                if (nums[i - 1] < nums[i])
                    break;
                i --;
            }
            i = i - 1;
            int k = i;
            if (k >= 0){
                for (int j = i + 1; j < nums.length; j ++)
                    if (nums[j] > nums[i])
                        k = j;
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }

            i = i + 1;
            int j = nums.length - 1;
            while (i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i ++;
                j --;
            }
        }
    }
}