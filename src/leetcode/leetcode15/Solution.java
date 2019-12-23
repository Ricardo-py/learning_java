package leetcode.leetcode15;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    @Test
    public void run(){
        int[] temp = {-2,0,0,2,2};
        System.out.println(threeSum(temp));
    }
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i ++){
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;
            int sum = 0 - nums[i];
            while(l < r){
                if (nums[l] + nums[r] == sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                    while (l < r && nums[l] == nums[l + 1]) l ++;
                    while (l < r && nums[r] == nums[r - 1]) r --;
                    l ++;
                    r --;
                }
                else if (nums[l] + nums[r] < sum){
                    while(l < r && nums[l] == nums[l + 1]) l ++;
                    l ++;
                }else{
                    while(l < r && nums[r] == nums[r - 1]) r --;
                    r --;
                }
            }
        }
        return result;
    }
}
