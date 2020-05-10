package leetcode.leetcode33;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        int[] nums = {8,9,2,3,4};
        System.out.println(search(nums,9));
    }

    public int search(int[] nums, int target){
        int rotate_position = findRotate_Position(nums);
        if (target < nums[0])
            return findnumPostion(nums,target,rotate_position, nums.length - 1);
        else {
            if (rotate_position == 0)
                return findnumPostion(nums,target,0,nums.length - 1);
            return findnumPostion(nums, target, 0, rotate_position - 1);
        }
    }

    public int findRotate_Position(int[] nums){
        int left = 0, right = nums.length - 1;
        if (nums[left] < nums[right])
            return 0;
        while (left <= right){
            int posMid = (left + right) / 2;
            if (nums[posMid] > nums[posMid + 1])
                return posMid + 1;
            else{
//                if (nums[posMid] > nums[left])
//                    left = posMid + 1;
//                else
//                    right = posMid - 1;
                if (nums[posMid] < nums[left])
                    right = posMid - 1;
                else
                    left = posMid + 1;
            }
        }
        return left;
    }

    public int findnumPostion(int[] nums, int target, int left, int right){
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

}
